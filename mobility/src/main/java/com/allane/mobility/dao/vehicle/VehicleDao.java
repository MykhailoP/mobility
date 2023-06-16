package com.allane.mobility.dao.vehicle;

import com.allane.mobility.persistence.tables.daos.AmVehicleDao;
import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.jooq.conf.RenderNameCase;
import org.springframework.stereotype.Repository;

import static com.google.common.base.MoreObjects.firstNonNull;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;
import static org.jooq.conf.RenderQuotedNames.EXPLICIT_DEFAULT_UNQUOTED;

@Repository
public class VehicleDao extends AmVehicleDao implements IVehicleDao {

    private final DSLContext context;

    public VehicleDao(DSLContext context) {
        context.settings().setRenderNameCase(RenderNameCase.AS_IS);
        context.configuration().settings().setRenderSchema(Boolean.FALSE);
        context.configuration().settings().setRenderNameCase(RenderNameCase.AS_IS);
        context.configuration().settings().setRenderQuotedNames(EXPLICIT_DEFAULT_UNQUOTED);
        context.configuration().settings().setRenderFormatted(Boolean.FALSE);
        this.context = context;
    }

    @Override
    public DSLContext ctx() {
        return context;
    }

    @Override
    public int newVehicle(AmVehicle vehicle) {
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
        return context.update(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE)
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.BRAND, vehicle.getBrand())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL, vehicle.getModel())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.MODEL_YEAR, vehicle.getModelYear())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.VIN_CODE, vehicle.getVinCode())
                .set(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.PRICE, vehicle.getPrice())
                .where(com.allane.mobility.persistence.tables.AmVehicle.AM_VEHICLE.ID_VEHICLE.eq(id)).execute();
    }

    @Override
    public AmVehicle one(Integer id) {
        return this.fetchOneByIdVehicle(id);
    }

}
