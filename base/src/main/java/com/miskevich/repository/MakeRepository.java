package com.miskevich.repository;

import com.miskevich.domain.Make;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeRepository extends JpaRepository<Make, Integer> {
}
