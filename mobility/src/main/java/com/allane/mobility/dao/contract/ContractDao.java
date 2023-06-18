package com.allane.mobility.dao.contract;

import com.allane.mobility.persistence.tables.AmCustomer;
import com.allane.mobility.persistence.tables.AmCustomerLeasingContract;
import com.allane.mobility.persistence.tables.AmVehicle;
import com.allane.mobility.persistence.tables.daos.AmLeasingContractDao;
import com.allane.mobility.persistence.tables.pojos.AmLeasingContract;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.google.common.base.MoreObjects.firstNonNull;
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
    public int insertContract(AmLeasingContract leasingContract) {
        ResultQuery<Record> maxId = context.resultQuery(format("select max(%s) AS %s from %s;",
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName(),
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName(),
                com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName()));
        Record r = maxId.fetchOne();
        Integer maxIdValue = ofNullable(r)
                .map(rr -> rr.getValue(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER))
                .orElse(0);
        leasingContract.setIdContractNumber(++maxIdValue);

        return ctx().insertInto(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT,
                        com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER,
                        com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE,
                        com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE)
                .values(leasingContract.getIdContractNumber(), leasingContract.getIdVehicle(),
                        leasingContract.getMonthlyRate())
                .execute();
    }

    @Override
    public int updateContract(AmLeasingContract leasingContract, Integer id) {
        AmLeasingContract existContract =
                fetchOne(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER, id);
        if (existContract == null) {
            return 0;
        }
        existContract.setIdVehicle(firstNonNull(leasingContract.getIdVehicle(), existContract.getIdVehicle()));
        existContract.setMonthlyRate(firstNonNull(leasingContract.getMonthlyRate(), existContract.getMonthlyRate()));

        return ctx().update(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT)
                .set(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE, existContract.getIdVehicle())
                .set(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE, existContract.getMonthlyRate())
                .where().execute();
    }

    @Override
    public AmLeasingContract selectOne(Integer id) {
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

    public String leasingContractJoinQuery() {
        String select = "SELECT";
        String from = "FROM";
        String join = "JOIN";
        String on = "ON";
        String as = "AS";
        String lc = "lc";
        String spc = " ";
        String dot = ".";
        String comma = ",";
        String eq = "=";
        String ob = "(";
        String cb = ")";
        String semicolon = ";";
        StringBuilder b = new StringBuilder(select);
        b.append(spc).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.getName())
                .append(dot).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName())
                .append(comma).append(spc).append(AmCustomer.AM_CUSTOMER.getName()).append(dot)
                .append(AmCustomer.AM_CUSTOMER.NAME.getName()).append(comma).append(spc)
                .append(AmCustomer.AM_CUSTOMER.getName()).append(dot).append(AmCustomer.AM_CUSTOMER.SURNAME.getName())
                .append(comma).append(spc).append(AmVehicle.AM_VEHICLE.BRAND.getName()).append(comma)
                .append(spc).append(AmVehicle.AM_VEHICLE.MODEL.getName()).append(comma)
                .append(spc).append(AmVehicle.AM_VEHICLE.MODEL_YEAR.getName()).append(comma)
                .append(spc).append(AmVehicle.AM_VEHICLE.VIN_CODE.getName()).append(comma).append(spc)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE.getName())
                .append(comma).append(spc).append(AmVehicle.AM_VEHICLE.PRICE.getName()).append(spc).append(from)
                .append(spc).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.getName()).append(spc)
                .append(join).append(spc).append(AmCustomer.AM_CUSTOMER.getName()).append(spc).append(on).append(spc)
                .append(AmCustomer.AM_CUSTOMER.getName()).append(dot).append(AmCustomer.AM_CUSTOMER.ID_CUSTOMER.getName())
                .append(eq).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.getName()).append(dot)
                .append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.ID_CUSTOMER.getName()).append(spc)
                .append(join).append(spc).append(ob).append(select).append(spc)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName()).append(dot)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName())
                .append(comma).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.BRAND.getName())
                .append(comma).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.MODEL.getName())
                .append(comma).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.MODEL_YEAR.getName())
                .append(comma).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.VIN_CODE.getName())
                .append(comma).append(spc)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName()).append(dot)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.MONTHLY_RATE.getName())
                .append(comma).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.PRICE.getName())
                .append(spc).append(from).append(spc)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName())
                .append(spc).append(join).append(spc)
                .append(AmVehicle.AM_VEHICLE.getName()).append(spc).append(on).append(spc)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.getName()).append(dot)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_VEHICLE.getName())
                .append(eq).append(AmVehicle.AM_VEHICLE.getName()).append(dot).append(AmVehicle.AM_VEHICLE.ID_VEHICLE.getName())
                .append(cb).append(spc).append(as).append(spc).append(lc).append(spc).append(on).append(spc).append(lc)
                .append(dot)
                .append(com.allane.mobility.persistence.tables.AmLeasingContract.AM_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName())
                .append(eq).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.getName())
                .append(dot).append(AmCustomerLeasingContract.AM_CUSTOMER_LEASING_CONTRACT.ID_CONTRACT_NUMBER.getName())
                .append(semicolon);
        return b.toString();
    }

}
