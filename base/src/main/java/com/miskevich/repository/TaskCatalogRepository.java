package com.miskevich.repository;

import com.miskevich.domain.TaskCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCatalogRepository extends JpaRepository<TaskCatalog, Integer> {
}
