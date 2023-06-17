package com.allane.mobility.dao.customer;

import com.allane.mobility.persistence.tables.daos.AmCustomerDao;
import com.allane.mobility.persistence.tables.pojos.AmCustomer;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.google.common.base.MoreObjects.firstNonNull;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@Repository
public class CustomerDao extends AmCustomerDao implements ICustomerDao {

    private final DSLContext context;

    public CustomerDao(DSLContext context) {
        this.context = context;
    }

    @Override
    public DSLContext ctx() {
        return context;
    }

    @Override
    public int newCustomer(AmCustomer customer) {
        ResultQuery<Record> maxId = context.resultQuery(format("select max(%s) AS %s from %s;",
                com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER.getName(),
                com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER.getName(),
                com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.getName()));
        Record r = maxId.fetchOne();
        Integer maxIdValue = ofNullable(r)
                .map(rr -> rr.getValue(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER))
                .orElse(0);
        customer.setIdCustomer(++maxIdValue);
        return ctx().insertInto(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER,
                        com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER,
                        com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.NAME,
                        com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.SURNAME,
                        com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.BIRTHDAY).
                values(customer.getIdCustomer(), customer.getName(), customer.getSurname(), customer.getBirthday())
                .execute();
    }

    @Override
    public int updateCustomer(AmCustomer customer, Integer id) {
        AmCustomer existCustomer =
                fetchOne(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER, id);
        if (existCustomer == null) {
            return 0;
        }
        existCustomer.setName(firstNonNull(customer.getName(), existCustomer.getName()));
        existCustomer.setSurname(firstNonNull(customer.getSurname(), existCustomer.getSurname()));
        existCustomer.setBirthday(firstNonNull(customer.getBirthday(), existCustomer.getBirthday()));

        return ctx().update(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER)
                .set(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.NAME, existCustomer.getName())
                .set(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.SURNAME, existCustomer.getSurname())
                .set(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.BIRTHDAY, existCustomer.getBirthday())
                .where(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER.eq(id)).execute();
    }

    @Override
    public AmCustomer one(Integer id) {
        return fetchOne(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER, id);
    }

    @Override
    public int delete(Integer id) {
        return ctx().delete(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER)
                .where(com.allane.mobility.persistence.tables.AmCustomer.AM_CUSTOMER.ID_CUSTOMER.eq(id)).execute();
    }

    @Override
    public List<AmCustomer> fetch() {
        return fetchRangeOfIdCustomer(0, Integer.MAX_VALUE);
    }

}
