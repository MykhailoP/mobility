package com.allane.mobility.dao.customer;

import com.allane.mobility.persistence.tables.pojos.AmCustomer;

import java.util.List;

public interface ICustomerDao {

    int newCustomer(AmCustomer customer);

    int updateCustomer(AmCustomer customer, Integer id);

    AmCustomer one(Integer id);

    int delete(Integer id);

    List<AmCustomer> fetch();

}
