package com.allane.mobility.dao.contract.dto;

import java.math.BigDecimal;

public class LeasingContractReport {
    public Integer idContractNumber;
    public String name;
    public String surname;
    public String brand;
    public String model;
    public Integer modelYear;
    public String vinCode;
    public BigDecimal monthlyRate;
    public BigDecimal price;

    public String getModelYear() {
        return "(" + modelYear + ")";
    }

    public String getVinCode() {
        return vinCode == null || vinCode.isEmpty() ? "-" : vinCode;
    }

}
