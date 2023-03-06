package com.miskevich.service.model;

import com.miskevich.domain.Model;
import com.miskevich.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModelServiceImpl implements ModelService{

    private final ModelRepository modelRepository;

    @Override
    @Transactional
    public Model creat(Model model) {
        return modelRepository.save(model);
    }

    @Override
    @Transactional
    public Model update(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Optional<Model> findById(int id) {
        return modelRepository.findById(id);
    }

    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        modelRepository.deleteById(id);

    }
}
