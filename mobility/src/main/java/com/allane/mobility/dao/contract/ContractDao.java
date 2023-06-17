package com.allane.mobility.dao.contract;

import com.allane.mobility.persistence.tables.daos.AmLeasingContractDao;
import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@Repository
public class ContractDao extends AmLeasingContractDao implements IContractDao {

    private final DSLContext context;

    public ContractDao(DSLContext context) {
        this.context = context;
    }

    @Override
    public DSLContext ctx() {
        return context;
    }

    @Override
    public int newContract(AmLeasingContract leasingContract) {
        ResultQuery<Record> maxId = context.resultQuery(format("select max(%s) AS %s from %s;",
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName(),
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName(),
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName()));
        Record r = maxId.fetchOne();
        Integer maxIdValue = ofNullable(r)
                .map(rr -> rr.getValue(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER))
                .orElse(0);
        leasingContract.setIdContractNumber(++maxIdValue);

        return 0;
    }

    @Override
    public int updateContract(AmLeasingContract leasingContract, Integer id) {
        return 0;
        /*
        *   ID_contract_number
            ID_vehicle
            monthly_rate
        *
        * */
    }

    @Override
    public AmLeasingContract one(Integer id) {
        return fetchOne(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER, id);
    }

    @Override
    public int delete(Integer id) {
        return ctx()
                .delete(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT)
                .where(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.eq(id))
                .execute();
    }

    @Override
    public List<AmLeasingContract> fetchAll() {
        return fetchRangeOfIdContractNumber(0, Integer.MAX_VALUE);
    }

}
