package com.allane.mobility.dao.vehicle;

import com.allane.mobility.persistence.tables.daos.AmVehicleDao;
import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.google.common.base.MoreObjects.firstNonNull;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@Repository
public class VehicleDao extends AmVehicleDao implements IVehicleDao {

    private final DSLContext context;

    public VehicleDao(DSLContext context) {
        this.context = context;
    }

    @Override
    public DSLContext ctx() {
        return context;
    }

    @Override
    public int insertVehicle(AmVehicle vehicle) {
        ResultQuery<Record> maxId = context.resultQuery(format("select max(%s) AS %s from %s;",
                com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.getName(),
                com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.getName(),
                com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.getName()));
        Record r = maxId.fetchOne();
        Integer maxIdValue = ofNullable(r)
                .map(rr -> rr.getValue(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE))
                .orElse(0);
        vehicle.setIdVehicle(++maxIdValue);

        return context.query(
                format("INSERT INTO %s (%s, %s, %s, %s, %s, %s) VALUES (%s, \"%s\", \"%s\", %s, \"%s\", %s);",
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.BRAND.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL_YEAR.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.VIN_CODE.getName(),
                        com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.PRICE.getName(),
                        vehicle.getIdVehicle(),
                        vehicle.getBrand(),
                        vehicle.getModel(),
                        vehicle.getModelYear(),
                        firstNonNull(vehicle.getVinCode(), ""),
                        vehicle.getPrice()
                )).execute();
    }

    @Override
    public int updateVehicle(AmVehicle vehicle, Integer id) {
        AmVehicle existVehicle = fetchOne(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE, id);
        if (existVehicle == null) {
            return 0;
        }
        existVehicle.setBrand(firstNonNull(vehicle.getBrand(), existVehicle.getBrand()));
        existVehicle.setModel(firstNonNull(vehicle.getModel(), existVehicle.getModel()));
        existVehicle.setModelYear(firstNonNull(vehicle.getModelYear(), existVehicle.getModelYear()));
        existVehicle.setVinCode(firstNonNull(vehicle.getVinCode(), existVehicle.getVinCode()));
        existVehicle.setPrice(firstNonNull(vehicle.getPrice(), existVehicle.getPrice()));

        return ctx().update(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE)
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.BRAND, existVehicle.getBrand())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL, existVehicle.getModel())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL_YEAR, existVehicle.getModelYear())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.VIN_CODE, existVehicle.getVinCode())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.PRICE, existVehicle.getPrice())
                .where(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.eq(id)).execute();
    }

    @Override
    public AmVehicle selectOne(Integer id) {
        return this.fetchOneByIdVehicle(id);
    }

    @Override
    public int delete(Integer id) {
        return ctx().delete(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE)
                .where(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.eq(id)).execute();
    }

    @Override
    public List<AmVehicle> fetchAll() {
        return fetchRangeOfIdVehicle(0, Integer.MAX_VALUE);
    }

}
