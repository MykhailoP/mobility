package com.allane.mobility.services.customer;

import com.allane.mobility.persistence.tables.pojos.AmCustomer;

import java.util.List;

public interface ICustomerService {

    int newCustomer(AmCustomer customer);

    int updateCustomer(AmCustomer customer, Integer id);

    AmCustomer one(Integer id);

    int delete(Integer id);

    List<AmCustomer> fetch();

}
