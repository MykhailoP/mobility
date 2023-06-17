package com.allane.mobility.dao.contract;

import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;

import java.util.List;

public interface IContractDao {

    int insertContract(AmLeasingContract leasingContract);

    int updateContract(AmLeasingContract leasingContract, Integer id);

    AmLeasingContract selectOne(Integer id);

    int delete(Integer id);

    List<AmLeasingContract> fetchAll();

}
