package com.allane.mobility.dao.customer;

import com.allane.mobility.persistence.tables.pojos.AmCustomer;

import java.util.List;

public interface ICustomerDao {

    int insertCustomer(AmCustomer customer);

    int updateCustomer(AmCustomer customer, Integer id);

    AmCustomer selectOne(Integer id);

    int delete(Integer id);

    List<AmCustomer> fetchAll();

}
