package com.miskevich.service.vehicleType;

import com.miskevich.domain.VehicleType;

import java.util.List;
import java.util.Optional;

public interface VehicleTypeService {

    VehicleType creat(VehicleType vehicleType);

    VehicleType update(VehicleType vehicleType);

    Optional<VehicleType> findById(int id);

    List<VehicleType> findAll();

    void delete(int id);
}
