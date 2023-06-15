package com.allane.mobility.rest.customer;

import com.allane.mobility.persistence.tables.pojos.AmCustomer;
import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static com.allane.mobility.rest.vehicle.VehicleController.API_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = API_PATH, produces = APPLICATION_JSON_VALUE)
public class CustomerController {

    @PostMapping("/customers")
    public AmLeasingContract customers(@RequestBody AmCustomer customer) {
        return null; //todo:: repository.save(newNote);
    }


    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Integer id) {

        //todo:: repository.deleteById();
    }


    @GetMapping("/customers/")
    public List<AmCustomer> all() {
        return Collections.emptyList();//todo:: repository.findAll();
    }


    @GetMapping("/customers/{id}")
    public AmCustomer one(@PathVariable Integer id) {
        return null; //todo:: repository.findById
    }


    @PutMapping("/customers/{id}")
    public AmCustomer replaceCustomer(@RequestBody AmCustomer customer, @PathVariable Integer id) {
        return customer; //todo:: update logic


    }

}
