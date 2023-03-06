package com.miskevich.service.offer;

import com.miskevich.domain.Offer;
import com.miskevich.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService{

    private final OfferRepository offerRepository;

    @Override
    @Transactional
    public Offer creat(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    @Transactional
    public Offer update(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public Optional<Offer> findById(int id) {
        return offerRepository.findById(id);
    }

    @Override
    public List<Offer> findAll() {
        return offerRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        offerRepository.deleteById(id);

    }
}
