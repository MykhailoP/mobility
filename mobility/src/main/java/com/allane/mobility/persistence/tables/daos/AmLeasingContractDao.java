/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.daos;


import com.allane.mobility.persistence.tables.AmLeasingContract;
import com.allane.mobility.persistence.tables.records.AmLeasingContractRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmLeasingContractDao extends DAOImpl<AmLeasingContractRecord, com.allane.mobility.persistence.tables.pojos.AmLeasingContract, Record2<UShort, UShort>> {

    /**
     * Create a new AmLeasingContractDao without any configuration
     */
    public AmLeasingContractDao() {
        super(AmLeasingContract.AM_LEASING_CONTRACT, com.allane.mobility.persistence.tables.pojos.AmLeasingContract.class);
    }

    /**
     * Create a new AmLeasingContractDao with an attached configuration
     */
    public AmLeasingContractDao(Configuration configuration) {
        super(AmLeasingContract.AM_LEASING_CONTRACT, com.allane.mobility.persistence.tables.pojos.AmLeasingContract.class, configuration);
    }

    @Override
    public Record2<UShort, UShort> getId(com.allane.mobility.persistence.tables.pojos.AmLeasingContract object) {
        return compositeKeyRecord(object.getIdContractNumber(), object.getIdVehicle());
    }

    /**
     * Fetch records that have <code>ID_contract_number BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchRangeOfIdContractNumber(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID_contract_number IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchByIdContractNumber(UShort... values) {
        return fetch(AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER, values);
    }

    /**
     * Fetch records that have <code>ID_vehicle BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchRangeOfIdVehicle(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID_vehicle IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchByIdVehicle(UShort... values) {
        return fetch(AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE, values);
    }

    /**
     * Fetch records that have <code>monthly_rate BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchRangeOfMonthlyRate(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>monthly_rate IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchByMonthlyRate(BigDecimal... values) {
        return fetch(AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE, values);
    }

    /**
     * Fetch records that have <code>changed BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchRangeOfChanged(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(AmLeasingContract.AM_LEASING_CONTRACT.CHANGED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>changed IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchByChanged(LocalDateTime... values) {
        return fetch(AmLeasingContract.AM_LEASING_CONTRACT.CHANGED, values);
    }

    /**
     * Fetch records that have <code>ID_user_change BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchRangeOfIdUserChange(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(AmLeasingContract.AM_LEASING_CONTRACT.ID_USER_CHANGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID_user_change IN (values)</code>
     */
    public List<com.allane.mobility.persistence.tables.pojos.AmLeasingContract> fetchByIdUserChange(UShort... values) {
        return fetch(AmLeasingContract.AM_LEASING_CONTRACT.ID_USER_CHANGE, values);
    }
}
