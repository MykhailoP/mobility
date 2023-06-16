package com.allane.mobility.dao.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;

public interface IVehicleDao {

    int newVehicle(AmVehicle vehicle);

    int updateVehicle(AmVehicle vehicle, Integer id);

    AmVehicle one(Integer id);

}
