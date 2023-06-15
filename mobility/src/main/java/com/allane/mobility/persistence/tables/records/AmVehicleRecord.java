/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.records;


import com.allane.mobility.persistence.tables.AmVehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmVehicleRecord extends UpdatableRecordImpl<AmVehicleRecord> implements Record8<Integer, String, String, Integer, String, BigDecimal, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>allmob.am_vehicle.ID_vehicle</code>.
     */
    public void setIdVehicle(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.ID_vehicle</code>.
     */
    public Integer getIdVehicle() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>allmob.am_vehicle.brand</code>.
     */
    public void setBrand(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.brand</code>.
     */
    public String getBrand() {
        return (String) get(1);
    }

    /**
     * Setter for <code>allmob.am_vehicle.model</code>.
     */
    public void setModel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.model</code>.
     */
    public String getModel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>allmob.am_vehicle.model_year</code>.
     */
    public void setModelYear(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.model_year</code>.
     */
    public Integer getModelYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>allmob.am_vehicle.vin_code</code>.
     */
    public void setVinCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.vin_code</code>.
     */
    public String getVinCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>allmob.am_vehicle.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>allmob.am_vehicle.changed</code>.
     */
    public void setChanged(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.changed</code>.
     */
    public LocalDateTime getChanged() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>allmob.am_vehicle.ID_user_change</code>.
     */
    public void setIdUserChange(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>allmob.am_vehicle.ID_user_change</code>.
     */
    public Integer getIdUserChange() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, Integer, String, BigDecimal, LocalDateTime, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, String, Integer, String, BigDecimal, LocalDateTime, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AmVehicle.AM_VEHICLE.ID_VEHICLE;
    }

    @Override
    public Field<String> field2() {
        return AmVehicle.AM_VEHICLE.BRAND;
    }

    @Override
    public Field<String> field3() {
        return AmVehicle.AM_VEHICLE.MODEL;
    }

    @Override
    public Field<Integer> field4() {
        return AmVehicle.AM_VEHICLE.MODEL_YEAR;
    }

    @Override
    public Field<String> field5() {
        return AmVehicle.AM_VEHICLE.VIN_CODE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return AmVehicle.AM_VEHICLE.PRICE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AmVehicle.AM_VEHICLE.CHANGED;
    }

    @Override
    public Field<Integer> field8() {
        return AmVehicle.AM_VEHICLE.ID_USER_CHANGE;
    }

    @Override
    public Integer component1() {
        return getIdVehicle();
    }

    @Override
    public String component2() {
        return getBrand();
    }

    @Override
    public String component3() {
        return getModel();
    }

    @Override
    public Integer component4() {
        return getModelYear();
    }

    @Override
    public String component5() {
        return getVinCode();
    }

    @Override
    public BigDecimal component6() {
        return getPrice();
    }

    @Override
    public LocalDateTime component7() {
        return getChanged();
    }

    @Override
    public Integer component8() {
        return getIdUserChange();
    }

    @Override
    public Integer value1() {
        return getIdVehicle();
    }

    @Override
    public String value2() {
        return getBrand();
    }

    @Override
    public String value3() {
        return getModel();
    }

    @Override
    public Integer value4() {
        return getModelYear();
    }

    @Override
    public String value5() {
        return getVinCode();
    }

    @Override
    public BigDecimal value6() {
        return getPrice();
    }

    @Override
    public LocalDateTime value7() {
        return getChanged();
    }

    @Override
    public Integer value8() {
        return getIdUserChange();
    }

    @Override
    public AmVehicleRecord value1(Integer value) {
        setIdVehicle(value);
        return this;
    }

    @Override
    public AmVehicleRecord value2(String value) {
        setBrand(value);
        return this;
    }

    @Override
    public AmVehicleRecord value3(String value) {
        setModel(value);
        return this;
    }

    @Override
    public AmVehicleRecord value4(Integer value) {
        setModelYear(value);
        return this;
    }

    @Override
    public AmVehicleRecord value5(String value) {
        setVinCode(value);
        return this;
    }

    @Override
    public AmVehicleRecord value6(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public AmVehicleRecord value7(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AmVehicleRecord value8(Integer value) {
        setIdUserChange(value);
        return this;
    }

    @Override
    public AmVehicleRecord values(Integer value1, String value2, String value3, Integer value4, String value5, BigDecimal value6, LocalDateTime value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AmVehicleRecord
     */
    public AmVehicleRecord() {
        super(AmVehicle.AM_VEHICLE);
    }

    /**
     * Create a detached, initialised AmVehicleRecord
     */
    public AmVehicleRecord(Integer idVehicle, String brand, String model, Integer modelYear, String vinCode, BigDecimal price, LocalDateTime changed, Integer idUserChange) {
        super(AmVehicle.AM_VEHICLE);

        setIdVehicle(idVehicle);
        setBrand(brand);
        setModel(model);
        setModelYear(modelYear);
        setVinCode(vinCode);
        setPrice(price);
        setChanged(changed);
        setIdUserChange(idUserChange);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AmVehicleRecord
     */
    public AmVehicleRecord(com.allane.mobility.persistence.tables.pojos.AmVehicle value) {
        super(AmVehicle.AM_VEHICLE);

        if (value != null) {
            setIdVehicle(value.getIdVehicle());
            setBrand(value.getBrand());
            setModel(value.getModel());
            setModelYear(value.getModelYear());
            setVinCode(value.getVinCode());
            setPrice(value.getPrice());
            setChanged(value.getChanged());
            setIdUserChange(value.getIdUserChange());
            resetChangedOnNotNull();
        }
    }
}
