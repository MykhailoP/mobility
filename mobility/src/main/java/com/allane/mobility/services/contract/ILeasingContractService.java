package com.allane.mobility.services.contract;

import com.allane.mobility.dao.contract.dto.LeasingContractReport;
import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;

import java.util.List;

public interface ILeasingContractService {

    int createLeasingContract(AmLeasingContract leasingContract);

    int updateLeasingContract(AmLeasingContract leasingContract, Integer id);

    AmLeasingContract getOne(Integer id);

    int delete(Integer id);

    List<AmLeasingContract> getAll();

    List<LeasingContractReport> leasingContractsReport();

}
