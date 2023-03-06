package com.miskevich.service.vehicle;

import com.miskevich.domain.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    Vehicle creat(Vehicle vehicle);

    Vehicle update(Vehicle vehicle);

    Optional<Vehicle> findById(int id);

    List<Vehicle> findAll();

    void delete(int id);
}
