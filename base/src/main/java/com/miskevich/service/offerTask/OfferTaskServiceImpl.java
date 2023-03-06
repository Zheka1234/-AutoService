package com.miskevich.service.offerTask;

import com.miskevich.domain.OfferTask;
import com.miskevich.repository.OfferTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfferTaskServiceImpl implements OffersTaskService{

    private final OfferTaskRepository offerTaskRepository;

    @Override
    @Transactional
    public OfferTask creat(OfferTask offerTask) {
        return offerTaskRepository.save(offerTask);
    }

    @Override
    @Transactional
    public OfferTask update(OfferTask offerTask) {
        return offerTaskRepository.save(offerTask);
    }

    @Override
    public Optional<OfferTask> findById(int id) {
        return offerTaskRepository.findById(id);
    }

    @Override
    public List<OfferTask> findAll() {
        return offerTaskRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        offerTaskRepository.deleteById(id);

    }
}
