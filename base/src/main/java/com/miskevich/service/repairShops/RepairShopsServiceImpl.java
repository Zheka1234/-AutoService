package com.miskevich.service.repairShops;

import com.miskevich.domain.RepairShops;
import com.miskevich.repository.RepairShopsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RepairShopsServiceImpl implements RepairShopsService{

    private final RepairShopsRepository repairShopsRepository;

    @Override
    @Transactional
    public RepairShops creat(RepairShops repairShops) {
        return repairShopsRepository.save(repairShops);
    }

    @Override
    @Transactional
    public RepairShops update(RepairShops repairShops) {
        return repairShopsRepository.save(repairShops);
    }

    @Override
    public Optional<RepairShops> findById(int id) {
        return repairShopsRepository.findById(id);
    }

    @Override
    public List<RepairShops> findAll() {
        return repairShopsRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        repairShopsRepository.deleteById(id);

    }
}
