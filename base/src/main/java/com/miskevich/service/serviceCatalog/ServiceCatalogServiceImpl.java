package com.miskevich.service.serviceCatalog;

import com.miskevich.domain.ServiceCatalog;
import com.miskevich.repository.ServiceCatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceCatalogServiceImpl implements ServiceCatalogService{

    private final ServiceCatalogRepository serviceCatalogRepository;

    @Override
    @Transactional
    public ServiceCatalog creat(ServiceCatalog serviceCatalog) {
        return serviceCatalogRepository.save(serviceCatalog);
    }

    @Override
    @Transactional
    public ServiceCatalog update(ServiceCatalog serviceCatalog) {
        return serviceCatalogRepository.save(serviceCatalog);
    }

    @Override
    public Optional<ServiceCatalog> findById(int id) {
        return serviceCatalogRepository.findById(id);
    }

    @Override
    public List<ServiceCatalog> findAll() {
        return serviceCatalogRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {

        serviceCatalogRepository.deleteById(id);

    }
}
