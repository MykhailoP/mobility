/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private UShort idUser;
    private String name;
    private String surname;
    private String email;
    private LocalDateTime changed;
    private UShort idUserChange;

    public AmUser() {}

    public AmUser(AmUser value) {
        this.idUser = value.idUser;
        this.name = value.name;
        this.surname = value.surname;
        this.email = value.email;
        this.changed = value.changed;
        this.idUserChange = value.idUserChange;
    }

    public AmUser(
        UShort idUser,
        String name,
        String surname,
        String email,
        LocalDateTime changed,
        UShort idUserChange
    ) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.changed = changed;
        this.idUserChange = idUserChange;
    }

    /**
     * Getter for <code>allmob.am_user.ID_user</code>.
     */
    public UShort getIdUser() {
        return this.idUser;
    }

    /**
     * Setter for <code>allmob.am_user.ID_user</code>.
     */
    public void setIdUser(UShort idUser) {
        this.idUser = idUser;
    }

    /**
     * Getter for <code>allmob.am_user.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>allmob.am_user.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>allmob.am_user.surname</code>.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Setter for <code>allmob.am_user.surname</code>.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Getter for <code>allmob.am_user.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>allmob.am_user.email</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>allmob.am_user.changed</code>.
     */
    public LocalDateTime getChanged() {
        return this.changed;
    }

    /**
     * Setter for <code>allmob.am_user.changed</code>.
     */
    public void setChanged(LocalDateTime changed) {
        this.changed = changed;
    }

    /**
     * Getter for <code>allmob.am_user.ID_user_change</code>.
     */
    public UShort getIdUserChange() {
        return this.idUserChange;
    }

    /**
     * Setter for <code>allmob.am_user.ID_user_change</code>.
     */
    public void setIdUserChange(UShort idUserChange) {
        this.idUserChange = idUserChange;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AmUser other = (AmUser) obj;
        if (this.idUser == null) {
            if (other.idUser != null)
                return false;
        }
        else if (!this.idUser.equals(other.idUser))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.surname == null) {
            if (other.surname != null)
                return false;
        }
        else if (!this.surname.equals(other.surname))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.changed == null) {
            if (other.changed != null)
                return false;
        }
        else if (!this.changed.equals(other.changed))
            return false;
        if (this.idUserChange == null) {
            if (other.idUserChange != null)
                return false;
        }
        else if (!this.idUserChange.equals(other.idUserChange))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.idUser == null) ? 0 : this.idUser.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.surname == null) ? 0 : this.surname.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.changed == null) ? 0 : this.changed.hashCode());
        result = prime * result + ((this.idUserChange == null) ? 0 : this.idUserChange.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AmUser (");

        sb.append(idUser);
        sb.append(", ").append(name);
        sb.append(", ").append(surname);
        sb.append(", ").append(email);
        sb.append(", ").append(changed);
        sb.append(", ").append(idUserChange);

        sb.append(")");
        return sb.toString();
    }
}
