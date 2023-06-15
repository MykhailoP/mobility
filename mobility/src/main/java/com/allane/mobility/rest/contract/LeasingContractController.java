package com.allane.mobility.rest.contract;

import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static com.allane.mobility.rest.vehicle.VehicleController.API_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = API_PATH, produces = APPLICATION_JSON_VALUE)
public class LeasingContractController {

    @PostMapping("/contracts")
    public AmLeasingContract contracts(@RequestBody AmLeasingContract leasingContract) {
        return null; //todo:: repository.save(newNote);
    }


    @DeleteMapping("/contracts/{id}")
    public void deleteLeasingContract(@PathVariable Integer id) {

        //todo:: repository.deleteById();
    }


    @GetMapping("/contracts/")
    public List<AmLeasingContract> all() {
        return Collections.emptyList();//todo:: repository.findAll();
    }


    @GetMapping("/contracts/{id}")
    public AmLeasingContract one(@PathVariable Integer id) {
        return null; //todo:: repository.findById
    }


    @PutMapping("/contracts/{id}")
    public AmLeasingContract replaceLeasingContract(@RequestBody AmLeasingContract leasingContract, @PathVariable Integer id) {
        return leasingContract; //todo:: update logic


    }


}
