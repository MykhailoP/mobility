package com.allane.mobility.services.vehicle;

import com.allane.mobility.dao.vehicle.IVehicleDao;
import com.allane.mobility.persistence.tables.pojos.AmVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {

    private final IVehicleDao vehicleDao;

    @Autowired
    public VehicleService(IVehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    @Override
    public int createVehicle(AmVehicle vehicle) {
        return vehicleDao.insertVehicle(vehicle);
    }

    @Override
    public int updateVehicle(AmVehicle vehicle, Integer id) {
        return vehicleDao.updateVehicle(vehicle, id);
    }

    @Override
    public AmVehicle getOne(Integer id) {
        return vehicleDao.selectOne(id);
    }

    @Override
    public int delete(Integer id) {
        return vehicleDao.delete(id);
    }

    @Override
    public List<AmVehicle> getAll() {
        return vehicleDao.fetchAll();
    }

}
