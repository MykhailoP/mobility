package com.allane.mobility.rest.contract;

import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import com.allane.mobility.services.contract.ILeasingContractService;
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
public class LeasingContractController {

    private final ILeasingContractService leasingContractService;

    @Autowired
    public LeasingContractController(ILeasingContractService leasingContractService) {
        this.leasingContractService = leasingContractService;
    }

    @PostMapping("/contracts")
    public ResponseEntity<AmLeasingContract> insert(@RequestBody AmLeasingContract leasingContract) {
        int savingResult = leasingContractService.createLeasingContract(leasingContract);
        int expectedRowsToInsert = 1;
        if (savingResult < expectedRowsToInsert) {
            return status(HttpStatus.INTERNAL_SERVER_ERROR).body(leasingContract);
        }
        return ok(leasingContract);
    }

    @DeleteMapping("/contracts/{id}")
    public int deleteLeasingContract(@PathVariable Integer id) {
        return leasingContractService.delete(id);
    }


    @GetMapping("/contracts/")
    public List<AmLeasingContract> getAll() {
        return leasingContractService.getAll();
    }


    @GetMapping("/contracts/{id}")
    public AmLeasingContract getOne(@PathVariable Integer id) {
        return leasingContractService.getOne(id);
    }


    @PutMapping("/contracts/{id}")
    public AmLeasingContract update(@RequestBody AmLeasingContract leasingContract, @PathVariable Integer id) {
        int updateRes = leasingContractService.updateLeasingContract(leasingContract, id);
        leasingContract.setIdContractNumber(id);
        return leasingContract;
    }

}
