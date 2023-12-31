/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmCustomerLeasingContract implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCustomer;
    private Integer idContractNumber;
    private LocalDateTime changed;
    private Integer idUserChange;

    public AmCustomerLeasingContract() {}

    public AmCustomerLeasingContract(AmCustomerLeasingContract value) {
        this.idCustomer = value.idCustomer;
        this.idContractNumber = value.idContractNumber;
        this.changed = value.changed;
        this.idUserChange = value.idUserChange;
    }

    public AmCustomerLeasingContract(
        Integer idCustomer,
        Integer idContractNumber,
        LocalDateTime changed,
        Integer idUserChange
    ) {
        this.idCustomer = idCustomer;
        this.idContractNumber = idContractNumber;
        this.changed = changed;
        this.idUserChange = idUserChange;
    }

    /**
     * Getter for <code>allmob.am_customer_leasing_contract.ID_customer</code>.
     */
    public Integer getIdCustomer() {
        return this.idCustomer;
    }

    /**
     * Setter for <code>allmob.am_customer_leasing_contract.ID_customer</code>.
     */
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * Getter for
     * <code>allmob.am_customer_leasing_contract.ID_contract_number</code>.
     */
    public Integer getIdContractNumber() {
        return this.idContractNumber;
    }

    /**
     * Setter for
     * <code>allmob.am_customer_leasing_contract.ID_contract_number</code>.
     */
    public void setIdContractNumber(Integer idContractNumber) {
        this.idContractNumber = idContractNumber;
    }

    /**
     * Getter for <code>allmob.am_customer_leasing_contract.changed</code>.
     */
    public LocalDateTime getChanged() {
        return this.changed;
    }

    /**
     * Setter for <code>allmob.am_customer_leasing_contract.changed</code>.
     */
    public void setChanged(LocalDateTime changed) {
        this.changed = changed;
    }

    /**
     * Getter for
     * <code>allmob.am_customer_leasing_contract.ID_user_change</code>.
     */
    public Integer getIdUserChange() {
        return this.idUserChange;
    }

    /**
     * Setter for
     * <code>allmob.am_customer_leasing_contract.ID_user_change</code>.
     */
    public void setIdUserChange(Integer idUserChange) {
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
        final AmCustomerLeasingContract other = (AmCustomerLeasingContract) obj;
        if (this.idCustomer == null) {
            if (other.idCustomer != null)
                return false;
        }
        else if (!this.idCustomer.equals(other.idCustomer))
            return false;
        if (this.idContractNumber == null) {
            if (other.idContractNumber != null)
                return false;
        }
        else if (!this.idContractNumber.equals(other.idContractNumber))
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
        result = prime * result + ((this.idCustomer == null) ? 0 : this.idCustomer.hashCode());
        result = prime * result + ((this.idContractNumber == null) ? 0 : this.idContractNumber.hashCode());
        result = prime * result + ((this.changed == null) ? 0 : this.changed.hashCode());
        result = prime * result + ((this.idUserChange == null) ? 0 : this.idUserChange.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AmCustomerLeasingContract (");

        sb.append(idCustomer);
        sb.append(", ").append(idContractNumber);
        sb.append(", ").append(changed);
        sb.append(", ").append(idUserChange);

        sb.append(")");
        return sb.toString();
    }
}
