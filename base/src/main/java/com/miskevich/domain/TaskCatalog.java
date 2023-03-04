package com.miskevich.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "task_catalog")
public class TaskCatalog {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "engine")
    private String engine;

    @Column(name = "task_price")
    private Double taskPrice;

    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "service_catalog_id")
    private ServiceCatalog serviceCatalog;

    @OneToMany(mappedBy = "taskCatalog", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<OfferTask> offerTasks;
}
