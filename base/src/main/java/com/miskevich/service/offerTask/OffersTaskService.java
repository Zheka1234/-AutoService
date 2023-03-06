package com.miskevich.service.offerTask;

import com.miskevich.domain.OfferTask;

import java.util.List;
import java.util.Optional;

public interface OffersTaskService {

    OfferTask creat(OfferTask offerTask);

    OfferTask update(OfferTask offerTask);

    Optional<OfferTask> findById(int id);

    List<OfferTask> findAll();

    void delete(int id);
}
