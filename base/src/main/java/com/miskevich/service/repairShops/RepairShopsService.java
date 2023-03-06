package com.miskevich.service.repairShops;

import com.miskevich.domain.RepairShops;

import java.util.List;
import java.util.Optional;

public interface RepairShopsService {

    RepairShops creat(RepairShops repairShops);

    RepairShops update(RepairShops repairShops);

    Optional<RepairShops> findById(int id);

    List<RepairShops> findAll();

    void delete(int id);
}
