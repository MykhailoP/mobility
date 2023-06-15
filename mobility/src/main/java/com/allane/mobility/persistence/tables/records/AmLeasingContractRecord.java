/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.records;


import com.allane.mobility.persistence.tables.AmLeasingContract;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmLeasingContractRecord extends UpdatableRecordImpl<AmLeasingContractRecord> implements Record5<UShort, UShort, BigDecimal, LocalDateTime, UShort> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>allmob.am_leasing_contract.ID_contract_number</code>.
     */
    public void setIdContractNumber(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>allmob.am_leasing_contract.ID_contract_number</code>.
     */
    public UShort getIdContractNumber() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>allmob.am_leasing_contract.ID_vehicle</code>.
     */
    public void setIdVehicle(UShort value) {
        set(1, value);
    }

    /**
     * Getter for <code>allmob.am_leasing_contract.ID_vehicle</code>.
     */
    public UShort getIdVehicle() {
        return (UShort) get(1);
    }

    /**
     * Setter for <code>allmob.am_leasing_contract.monthly_rate</code>.
     */
    public void setMonthlyRate(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>allmob.am_leasing_contract.monthly_rate</code>.
     */
    public BigDecimal getMonthlyRate() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>allmob.am_leasing_contract.changed</code>.
     */
    public void setChanged(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>allmob.am_leasing_contract.changed</code>.
     */
    public LocalDateTime getChanged() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>allmob.am_leasing_contract.ID_user_change</code>.
     */
    public void setIdUserChange(UShort value) {
        set(4, value);
    }

    /**
     * Getter for <code>allmob.am_leasing_contract.ID_user_change</code>.
     */
    public UShort getIdUserChange() {
        return (UShort) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UShort, UShort> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UShort, UShort, BigDecimal, LocalDateTime, UShort> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UShort, UShort, BigDecimal, LocalDateTime, UShort> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UShort> field1() {
        return AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER;
    }

    @Override
    public Field<UShort> field2() {
        return AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE;
    }

    @Override
    public Field<BigDecimal> field3() {
        return AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return AmLeasingContract.AM_LEASING_CONTRACT.CHANGED;
    }

    @Override
    public Field<UShort> field5() {
        return AmLeasingContract.AM_LEASING_CONTRACT.ID_USER_CHANGE;
    }

    @Override
    public UShort component1() {
        return getIdContractNumber();
    }

    @Override
    public UShort component2() {
        return getIdVehicle();
    }

    @Override
    public BigDecimal component3() {
        return getMonthlyRate();
    }

    @Override
    public LocalDateTime component4() {
        return getChanged();
    }

    @Override
    public UShort component5() {
        return getIdUserChange();
    }

    @Override
    public UShort value1() {
        return getIdContractNumber();
    }

    @Override
    public UShort value2() {
        return getIdVehicle();
    }

    @Override
    public BigDecimal value3() {
        return getMonthlyRate();
    }

    @Override
    public LocalDateTime value4() {
        return getChanged();
    }

    @Override
    public UShort value5() {
        return getIdUserChange();
    }

    @Override
    public AmLeasingContractRecord value1(UShort value) {
        setIdContractNumber(value);
        return this;
    }

    @Override
    public AmLeasingContractRecord value2(UShort value) {
        setIdVehicle(value);
        return this;
    }

    @Override
    public AmLeasingContractRecord value3(BigDecimal value) {
        setMonthlyRate(value);
        return this;
    }

    @Override
    public AmLeasingContractRecord value4(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AmLeasingContractRecord value5(UShort value) {
        setIdUserChange(value);
        return this;
    }

    @Override
    public AmLeasingContractRecord values(UShort value1, UShort value2, BigDecimal value3, LocalDateTime value4, UShort value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AmLeasingContractRecord
     */
    public AmLeasingContractRecord() {
        super(AmLeasingContract.AM_LEASING_CONTRACT);
    }

    /**
     * Create a detached, initialised AmLeasingContractRecord
     */
    public AmLeasingContractRecord(UShort idContractNumber, UShort idVehicle, BigDecimal monthlyRate, LocalDateTime changed, UShort idUserChange) {
        super(AmLeasingContract.AM_LEASING_CONTRACT);

        setIdContractNumber(idContractNumber);
        setIdVehicle(idVehicle);
        setMonthlyRate(monthlyRate);
        setChanged(changed);
        setIdUserChange(idUserChange);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AmLeasingContractRecord
     */
    public AmLeasingContractRecord(com.allane.mobility.persistence.tables.pojos.AmLeasingContract value) {
        super(AmLeasingContract.AM_LEASING_CONTRACT);

        if (value != null) {
            setIdContractNumber(value.getIdContractNumber());
            setIdVehicle(value.getIdVehicle());
            setMonthlyRate(value.getMonthlyRate());
            setChanged(value.getChanged());
            setIdUserChange(value.getIdUserChange());
            resetChangedOnNotNull();
        }
    }
}
