package com.allane.mobility.rest.customer;

import com.allane.mobility.persistence.tables.pojos.AmCustomer;
import com.allane.mobility.services.customer.ICustomerService;
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
public class CustomerController {

    private final ICustomerService customerService;

    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customers")
    public ResponseEntity<AmCustomer> insert(@RequestBody AmCustomer customer) {
        int savingResult = customerService.createCustomer(customer);
        int expectedRowsToInsert = 1;
        if (savingResult < expectedRowsToInsert) {
            return status(HttpStatus.INTERNAL_SERVER_ERROR).body(customer);
        }
        return ok(customer);
    }

    @DeleteMapping("/customers/{id}")
    public int deleteCustomer(@PathVariable Integer id) {
        return customerService.delete(id);
    }

    @GetMapping("/customers/")
    public List<AmCustomer> getAll() {
        return customerService.getAll();
    }

    @GetMapping("/customers/{id}")
    public AmCustomer getOne(@PathVariable Integer id) {
        return customerService.getOne(id);
    }

    @PutMapping("/customers/{id}")
    public AmCustomer update(@RequestBody AmCustomer customer, @PathVariable Integer id) {
        int updateRes = customerService.updateCustomer(customer, id);
        customer.setIdCustomer(id);
        return customer;
    }

}
