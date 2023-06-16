package com.allane.mobility.rest.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import com.allane.mobility.services.vehicle.IVehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/vehicles")
    public ResponseEntity<AmVehicle> vehicles(@RequestBody AmVehicle vehicle) {
        int savingResult = vehicleService.newVehicle(vehicle);
        int expectedRowsToInsert = 1;
        if (savingResult < expectedRowsToInsert) {
            return status(HttpStatus.INTERNAL_SERVER_ERROR).body(vehicle);
        }
        return ok(vehicle);
    }


    @DeleteMapping("/vehicles/{id}")
    public void deleteLeasingContract(@PathVariable Integer id) {

        //todo:: repository.deleteById();
    }


    @GetMapping("/vehicles/")
    public List<AmVehicle> all() {
        return Collections.emptyList();//todo:: repository.findAll();
    }


    @GetMapping("/vehicles/{id}")
    public AmVehicle one(@PathVariable Integer id) {
        return vehicleService.one(id);
    }


    @PutMapping("/vehicles/{id}")
    public AmVehicle replaceNote(@RequestBody AmVehicle vehicle, @PathVariable Integer id) {
        int updateRes = vehicleService.updateVehicle(vehicle, id);
        vehicle.setIdVehicle(id);
        return vehicle;
    }


}
