package com.miskevich.service.make;

import com.miskevich.domain.Make;
import com.miskevich.repository.MakeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MakeServiceImpl implements MakeService {

    private final MakeRepository makeRepository;

    @Override
    @Transactional
    public Make creat(Make make) {
        return makeRepository.save(make);
    }

    @Override
    @Transactional
    public Make update(Make make) {
        return makeRepository.save(make);
    }

    @Override
    public Optional<Make> findById(int id) {
        return makeRepository.findById(id);
    }

    @Override
    public List<Make> findAll() {
        return makeRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        makeRepository.deleteById(id);
    }
}
