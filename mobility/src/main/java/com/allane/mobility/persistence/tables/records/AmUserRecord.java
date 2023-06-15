/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.records;


import com.allane.mobility.persistence.tables.AmUser;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmUserRecord extends UpdatableRecordImpl<AmUserRecord> implements Record6<Integer, String, String, String, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>allmob.am_user.ID_user</code>.
     */
    public void setIdUser(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>allmob.am_user.ID_user</code>.
     */
    public Integer getIdUser() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>allmob.am_user.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>allmob.am_user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>allmob.am_user.surname</code>.
     */
    public void setSurname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>allmob.am_user.surname</code>.
     */
    public String getSurname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>allmob.am_user.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>allmob.am_user.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>allmob.am_user.changed</code>.
     */
    public void setChanged(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>allmob.am_user.changed</code>.
     */
    public LocalDateTime getChanged() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>allmob.am_user.ID_user_change</code>.
     */
    public void setIdUserChange(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>allmob.am_user.ID_user_change</code>.
     */
    public Integer getIdUserChange() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AmUser.AM_USER.ID_USER;
    }

    @Override
    public Field<String> field2() {
        return AmUser.AM_USER.NAME;
    }

    @Override
    public Field<String> field3() {
        return AmUser.AM_USER.SURNAME;
    }

    @Override
    public Field<String> field4() {
        return AmUser.AM_USER.EMAIL;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return AmUser.AM_USER.CHANGED;
    }

    @Override
    public Field<Integer> field6() {
        return AmUser.AM_USER.ID_USER_CHANGE;
    }

    @Override
    public Integer component1() {
        return getIdUser();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getSurname();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public LocalDateTime component5() {
        return getChanged();
    }

    @Override
    public Integer component6() {
        return getIdUserChange();
    }

    @Override
    public Integer value1() {
        return getIdUser();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getSurname();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public LocalDateTime value5() {
        return getChanged();
    }

    @Override
    public Integer value6() {
        return getIdUserChange();
    }

    @Override
    public AmUserRecord value1(Integer value) {
        setIdUser(value);
        return this;
    }

    @Override
    public AmUserRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AmUserRecord value3(String value) {
        setSurname(value);
        return this;
    }

    @Override
    public AmUserRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public AmUserRecord value5(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AmUserRecord value6(Integer value) {
        setIdUserChange(value);
        return this;
    }

    @Override
    public AmUserRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AmUserRecord
     */
    public AmUserRecord() {
        super(AmUser.AM_USER);
    }

    /**
     * Create a detached, initialised AmUserRecord
     */
    public AmUserRecord(Integer idUser, String name, String surname, String email, LocalDateTime changed, Integer idUserChange) {
        super(AmUser.AM_USER);

        setIdUser(idUser);
        setName(name);
        setSurname(surname);
        setEmail(email);
        setChanged(changed);
        setIdUserChange(idUserChange);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AmUserRecord
     */
    public AmUserRecord(com.allane.mobility.persistence.tables.pojos.AmUser value) {
        super(AmUser.AM_USER);

        if (value != null) {
            setIdUser(value.getIdUser());
            setName(value.getName());
            setSurname(value.getSurname());
            setEmail(value.getEmail());
            setChanged(value.getChanged());
            setIdUserChange(value.getIdUserChange());
            resetChangedOnNotNull();
        }
    }
}
