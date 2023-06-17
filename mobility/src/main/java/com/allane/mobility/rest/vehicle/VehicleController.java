package com.allane.mobility.rest.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import com.allane.mobility.services.vehicle.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.allane.mobility.rest.vehicle.VehicleController.API_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path = API_PATH, produces = APPLICATION_JSON_VALUE)
public class VehicleController {

    public static final String API_PATH = "/api";

    private final IVehicleService vehicleService;

    @Autowired
    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/vehicles")
    public ResponseEntity<AmVehicle> insert(@RequestBody AmVehicle vehicle) {
        int savingResult = vehicleService.createVehicle(vehicle);
        int expectedRowsToInsert = 1;
        if (savingResult < expectedRowsToInsert) {
            return status(HttpStatus.INTERNAL_SERVER_ERROR).body(vehicle);
        }
        return ok(vehicle);
    }

    @DeleteMapping("/vehicles/{id}")
    public int deleteVehicle(@PathVariable Integer id) {
        return vehicleService.delete(id);
    }

    @GetMapping("/vehicles/")
    public List<AmVehicle> getAll() {
        return vehicleService.getAll();
    }

    @GetMapping("/vehicles/{id}")
    public AmVehicle getOne(@PathVariable Integer id) {
        return vehicleService.getOne(id);
    }

    @PutMapping("/vehicles/{id}")
    public AmVehicle update(@RequestBody AmVehicle vehicle, @PathVariable Integer id) {
        int updateRes = vehicleService.updateVehicle(vehicle, id);
        vehicle.setIdVehicle(id);
        return vehicle;
    }

}
