package com.allane.mobility.services.contract;

import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;

import java.util.List;

public interface ILeasingContractService {

    int newLeasingContract(AmLeasingContract leasingContract);

    int updateLeasingContract(AmLeasingContract leasingContract, Integer id);

    AmLeasingContract one(Integer id);

    int delete(Integer id);

    List<AmLeasingContract> fetchAll();

}
