/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables;


import com.allane.mobility.persistence.Allmob;
import com.allane.mobility.persistence.Keys;
import com.allane.mobility.persistence.tables.records.AmCustomerLeasingContractRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmCustomerLeasingContract extends TableImpl<AmCustomerLeasingContractRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>allmob.am_customer_leasing_contract</code>
     */
    public static final AmCustomerLeasingContract AM_CUSTOMER_LEASING_CONTRACT = new AmCustomerLeasingContract();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AmCustomerLeasingContractRecord> getRecordType() {
        return AmCustomerLeasingContractRecord.class;
    }

    /**
     * The column <code>allmob.am_customer_leasing_contract.ID_customer</code>.
     */
    public final TableField<AmCustomerLeasingContractRecord, UShort> ID_CUSTOMER = createField(DSL.name("ID_customer"), SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>allmob.am_customer_leasing_contract.ID_contract_number</code>.
     */
    public final TableField<AmCustomerLeasingContractRecord, UShort> ID_CONTRACT_NUMBER = createField(DSL.name("ID_contract_number"), SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>allmob.am_customer_leasing_contract.changed</code>.
     */
    public final TableField<AmCustomerLeasingContractRecord, LocalDateTime> CHANGED = createField(DSL.name("changed"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>allmob.am_customer_leasing_contract.ID_user_change</code>.
     */
    public final TableField<AmCustomerLeasingContractRecord, UShort> ID_USER_CHANGE = createField(DSL.name("ID_user_change"), SQLDataType.SMALLINTUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.SMALLINTUNSIGNED)), this, "");

    private AmCustomerLeasingContract(Name alias, Table<AmCustomerLeasingContractRecord> aliased) {
        this(alias, aliased, null);
    }

    private AmCustomerLeasingContract(Name alias, Table<AmCustomerLeasingContractRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>allmob.am_customer_leasing_contract</code> table
     * reference
     */
    public AmCustomerLeasingContract(String alias) {
        this(DSL.name(alias), AM_CUSTOMER_LEASING_CONTRACT);
    }

    /**
     * Create an aliased <code>allmob.am_customer_leasing_contract</code> table
     * reference
     */
    public AmCustomerLeasingContract(Name alias) {
        this(alias, AM_CUSTOMER_LEASING_CONTRACT);
    }

    /**
     * Create a <code>allmob.am_customer_leasing_contract</code> table reference
     */
    public AmCustomerLeasingContract() {
        this(DSL.name("am_customer_leasing_contract"), null);
    }

    public <O extends Record> AmCustomerLeasingContract(Table<O> child, ForeignKey<O, AmCustomerLeasingContractRecord> key) {
        super(child, key, AM_CUSTOMER_LEASING_CONTRACT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Allmob.ALLMOB;
    }

    @Override
    public UniqueKey<AmCustomerLeasingContractRecord> getPrimaryKey() {
        return Keys.KEY_AM_CUSTOMER_LEASING_CONTRACT_PRIMARY;
    }

    @Override
    public AmCustomerLeasingContract as(String alias) {
        return new AmCustomerLeasingContract(DSL.name(alias), this);
    }

    @Override
    public AmCustomerLeasingContract as(Name alias) {
        return new AmCustomerLeasingContract(alias, this);
    }

    @Override
    public AmCustomerLeasingContract as(Table<?> alias) {
        return new AmCustomerLeasingContract(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AmCustomerLeasingContract rename(String name) {
        return new AmCustomerLeasingContract(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AmCustomerLeasingContract rename(Name name) {
        return new AmCustomerLeasingContract(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AmCustomerLeasingContract rename(Table<?> name) {
        return new AmCustomerLeasingContract(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<UShort, UShort, LocalDateTime, UShort> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super UShort, ? super UShort, ? super LocalDateTime, ? super UShort, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super UShort, ? super UShort, ? super LocalDateTime, ? super UShort, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}