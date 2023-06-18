package com.allane.mobility.dao;

import com.allane.mobility.dao.contract.ContractDao;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ContractDaoTests {

    @MockBean
    private DSLContext context;

    @Autowired
    private ContractDao contractDao;

    @Test
    void testLeasingContractJoinQuery() {
        String queryRes = contractDao.leasingContractJoinQuery();
        String expectedQuery = "SELECT am_customer_leasing_contract.ID_contract_number, am_customer.name, " +
                "am_customer.surname, brand, model, model_year, vin_code, monthly_rate, price " +
                "FROM am_customer_leasing_contract " +
                "JOIN am_customer ON am_customer.ID_customer=am_customer_leasing_contract.ID_customer " +
                "JOIN " +
                "(SELECT am_leasing_contract.ID_contract_number, am_vehicle.brand, " +
                "am_vehicle.model, am_vehicle.model_year, am_vehicle.vin_code, " +
                "am_leasing_contract.monthly_rate, am_vehicle.price FROM am_leasing_contract " +
                "JOIN am_vehicle ON am_leasing_contract.ID_vehicle=am_vehicle.ID_vehicle) AS lc " +
                "ON lc.ID_contract_number=am_customer_leasing_contract.ID_contract_number;";
        assertThat(queryRes).isEqualTo(expectedQuery);
    }

}
