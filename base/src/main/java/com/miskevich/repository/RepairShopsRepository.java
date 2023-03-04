package com.miskevich.repository;


import com.miskevich.domain.RepairShops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairShopsRepository extends JpaRepository<RepairShops, Integer> {
}
