package com.allane.mobility.dao.contract;

import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;

import java.util.List;

public interface IContractDao {

    int newContract(AmLeasingContract leasingContract);

    int updateContract(AmLeasingContract leasingContract, Integer id);

    AmLeasingContract one(Integer id);

    int delete(Integer id);

    List<AmLeasingContract> fetchAll();

}
