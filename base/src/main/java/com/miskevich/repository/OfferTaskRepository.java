package com.miskevich.repository;

import com.miskevich.domain.OfferTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferTaskRepository extends JpaRepository<OfferTask, Integer> {
}
