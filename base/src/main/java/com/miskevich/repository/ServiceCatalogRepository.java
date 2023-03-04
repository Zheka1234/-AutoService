package com.miskevich.repository;

import com.miskevich.domain.ServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCatalogRepository extends JpaRepository<ServiceCatalog, Integer> {
}
