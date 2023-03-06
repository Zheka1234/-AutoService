package com.miskevich.service.offer;

import com.miskevich.domain.Offer;

import java.util.List;
import java.util.Optional;

public interface OfferService {

    Offer creat(Offer offer);

    Offer update(Offer offer);

    Optional<Offer> findById(int id);

    List<Offer> findAll();

    void delete(int id);
}
