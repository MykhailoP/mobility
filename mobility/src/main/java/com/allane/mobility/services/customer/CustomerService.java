package com.allane.mobility.services.customer;

import com.allane.mobility.dao.customer.ICustomerDao;
import com.allane.mobility.persistence.tables.pojos.AmCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private final ICustomerDao customerDao;

    @Autowired
    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public int createCustomer(AmCustomer customer) {
        return customerDao.insertCustomer(customer);
    }

    @Override
    public int updateCustomer(AmCustomer customer, Integer id) {
        return customerDao.updateCustomer(customer, id);
    }

    @Override
    public AmCustomer getOne(Integer id) {
        return customerDao.selectOne(id);
    }

    @Override
    public int delete(Integer id) {
        return customerDao.delete(id);
    }

    @Override
    public List<AmCustomer> getAll() {
        return customerDao.fetchAll();
    }

}
