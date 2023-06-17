package com.allane.mobility.dao.vehicle;

import com.allane.mobility.persistence.tables.pojos.AmVehicle;

import java.util.List;

public interface IVehicleDao {

    int newVehicle(AmVehicle vehicle);

    int updateVehicle(AmVehicle vehicle, Integer id);

    AmVehicle one(Integer id);

    int delete(Integer id);

    List<AmVehicle> fetchRangeOfIdVehicle();

}
