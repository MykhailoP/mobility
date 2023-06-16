package com.allane.mobility.services.vehicle;

import com.allane.mobility.dao.vehicle.IVehicleDao;
import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.springframework.stereotype.Service;

import static com.google.common.base.MoreObjects.firstNonNull;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;

@Service
public class VehicleService implements IVehicleService {

    private final DSLContext context;
    private final IVehicleDao vehicleDao;

    public VehicleService(DSLContext context, IVehicleDao vehicleDao) {
        this.context = context;
        this.vehicleDao = vehicleDao;
    }

    @Override
    public int newVehicle(AmVehicle vehicle) {
        return vehicleDao.newVehicle(vehicle);
    }

    @Override
    public int updateVehicle(AmVehicle vehicle, Integer id) {
        return vehicleDao.updateVehicle(vehicle, id);
    }

    @Override
    public AmVehicle one(Integer id) {
        return vehicleDao.one(id);
    }
}
