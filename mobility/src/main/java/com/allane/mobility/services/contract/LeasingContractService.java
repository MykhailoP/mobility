package com.allane.mobility.services.contract;

import com.allane.mobility.dao.contract.IContractDao;
import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeasingContractService implements ILeasingContractService {

    private final IContractDao contractDao;

    @Autowired
    public LeasingContractService(IContractDao contractDao) {
        this.contractDao = contractDao;
    }

    @Override
    public int newLeasingContract(AmLeasingContract leasingContract) {
        return contractDao.newContract(leasingContract);
    }

    @Override
    public int updateLeasingContract(AmLeasingContract leasingContract, Integer id) {
        return contractDao.updateContract(leasingContract, id);
    }

    @Override
    public AmLeasingContract one(Integer id) {
        return contractDao.one(id);
    }

    @Override
    public int delete(Integer id) {
        return contractDao.delete(id);
    }

    @Override
    public List<AmLeasingContract> fetchAll() {
        return contractDao.fetchAll();
    }

}
