/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.daos;


import com.allane.mobility.persistence.tables.AmCustomer;
import com.allane.mobility.persistence.tables.records.AmCustomerRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmCustomerDao extends DAOImpl<AmCustomerRecord, com.allane.mobility.persistence.tables.pojos.AmCustomer, Record3<Integer, String, String>> {

    /**
     * Create a new AmCustomerDao without any configuration
     */
    public AmCustomerDao() {
        super(AmCustomer.AM_CUSTOMER, com.allane.mobility.persistence.tables.pojos.AmCustomer.class);
    }

    /**
     * Create a new AmCustomerDao with an attached configuration
     */
    public AmCustomerDao(Configuration configuration) {
        super(AmCustomer.AM_CUSTOMER, com.allane.mobility.persistence.tables.pojos.AmCustomer.class, configuration);
    }

    @Override
    public Record3<Integer, String, String> getId(com.allane.mobility.persistence.tables.pojos.AmCustomer object) {
        return compositeKeyRecord(object.getIdCustomer(), object.getName(), object.getSurname());
    }

    /**
     * Fetch records that have <code>ID_customer BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfIdCustomer(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.ID_CUSTOMER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID_customer IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchByIdCustomer(Integer... values) {
        return fetch(AmCustomer.AM_CUSTOMER.ID_CUSTOMER, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchByName(String... values) {
        return fetch(AmCustomer.AM_CUSTOMER.NAME, values);
    }

    /**
     * Fetch records that have <code>surname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfSurname(String lowerInclusive, String upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.SURNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>surname IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchBySurname(String... values) {
        return fetch(AmCustomer.AM_CUSTOMER.SURNAME, values);
    }

    /**
     * Fetch records that have <code>birthday BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfBirthday(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.BIRTHDAY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>birthday IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchByBirthday(LocalDateTime... values) {
        return fetch(AmCustomer.AM_CUSTOMER.BIRTHDAY, values);
    }

    /**
     * Fetch records that have <code>changed BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfChanged(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.CHANGED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>changed IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchByChanged(LocalDateTime... values) {
        return fetch(AmCustomer.AM_CUSTOMER.CHANGED, values);
    }

    /**
     * Fetch records that have <code>ID_user_change BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchRangeOfIdUserChange(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(AmCustomer.AM_CUSTOMER.ID_USER_CHANGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID_user_change IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmCustomer> fetchByIdUserChange(Integer... values) {
        return fetch(AmCustomer.AM_CUSTOMER.ID_USER_CHANGE, values);
    }
}
