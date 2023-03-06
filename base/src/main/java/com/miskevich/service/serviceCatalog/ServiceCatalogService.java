package com.miskevich.service.serviceCatalog;

import com.miskevich.domain.ServiceCatalog;

import java.util.List;
import java.util.Optional;

public interface ServiceCatalogService {

    ServiceCatalog creat(ServiceCatalog serviceCatalog);

    ServiceCatalog update(ServiceCatalog serviceCatalog);

    Optional<ServiceCatalog> findById(int id);

    List<ServiceCatalog> findAll();

    void delete(int id);
}
