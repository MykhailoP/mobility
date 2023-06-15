package com.allane.mobility.services.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Service;

import static com.google.common.base.MoreObjects.firstNonNull;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@Service
public class VehicleService {

    private final DSLContext context;

    public VehicleService(DSLContext context) {
        this.context = context;
    }

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

}
