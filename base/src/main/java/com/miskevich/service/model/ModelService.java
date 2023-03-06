package com.miskevich.service.model;

import com.miskevich.domain.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {

    Model creat(Model model);

    Model update(Model model);

    Optional<Model> findById(int id);

    List<Model> findAll();

    void delete(int id);
}
