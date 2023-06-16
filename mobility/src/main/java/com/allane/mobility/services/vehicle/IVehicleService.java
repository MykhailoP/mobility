package com.allane.mobility.services.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;

public interface IVehicleService {

    int newVehicle(AmVehicle vehicle);

    int updateVehicle(AmVehicle vehicle, Integer id);

    AmVehicle one(Integer id);

}
