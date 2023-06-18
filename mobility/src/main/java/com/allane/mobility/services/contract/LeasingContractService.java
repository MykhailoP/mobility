package com.allane.mobility.services.contract;

import com.allane.mobility.dao.contract.IContractDao;
import com.allane.mobility.dao.contract.dto.LeasingContractReport;
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
    public int createLeasingContract(AmLeasingContract leasingContract) {
        return contractDao.insertContract(leasingContract);
    }

    @Override
    public int updateLeasingContract(AmLeasingContract leasingContract, Integer id) {
        return contractDao.updateContract(leasingContract, id);
    }

    @Override
    public AmLeasingContract getOne(Integer id) {
        return contractDao.selectOne(id);
    }

    @Override
    public int delete(Integer id) {
        return contractDao.delete(id);
    }

    @Override
    public List<AmLeasingContract> getAll() {
        return contractDao.fetchAll();
    }

    @Override
    public List<LeasingContractReport> leasingContractsReport() {
        return contractDao.leasingContractsReport();
    }

}
