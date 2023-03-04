package com.miskevich.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "service_catalog")
public class ServiceCatalog {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "description")
    private String description;

    @Column(name = "service_discount")
    private Double serviceDiscount;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "serviceCatalog", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<TaskCatalog> taskCatalogs;

    @OneToMany(mappedBy = "serviceCatalog", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<Offer> offers;
}
