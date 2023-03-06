package com.miskevich.service.vehicleType;

import com.miskevich.domain.VehicleType;
import com.miskevich.repository.VehicleTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleTypeServiceImpl implements VehicleTypeService{

    private final VehicleTypeRepository vehicleTypeRepository;

    @Override
    @Transactional
    public VehicleType creat(VehicleType vehicleType) {
        return vehicleTypeRepository.save(vehicleType);
    }

    @Override
    @Transactional
    public VehicleType update(VehicleType vehicleType) {
        return vehicleTypeRepository.save(vehicleType);
    }

    @Override
    public Optional<VehicleType> findById(int id) {
        return vehicleTypeRepository.findById(id);
    }

    @Override
    public List<VehicleType> findAll() {
        return vehicleTypeRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {

        vehicleTypeRepository.deleteById(id);

    }
}
