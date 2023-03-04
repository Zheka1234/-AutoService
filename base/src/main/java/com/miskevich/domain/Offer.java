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
@Table(name = "offer")
public class Offer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "offer_description")
    private String offerDescription;

    @Column(name = "service_discount")
    private Double serviceDiscount;

    @Column(name = "offer_price")
    private Double offerPrice;

    @OneToMany(mappedBy = "offer", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<OfferTask> offerTasks;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "service_catalog_id")
    private ServiceCatalog serviceCatalog;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
