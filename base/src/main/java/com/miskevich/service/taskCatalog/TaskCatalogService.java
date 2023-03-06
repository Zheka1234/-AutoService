package com.miskevich.service.taskCatalog;

import com.miskevich.domain.TaskCatalog;

import java.util.List;
import java.util.Optional;

public interface TaskCatalogService {

    TaskCatalog creat(TaskCatalog taskCatalog);

    TaskCatalog update(TaskCatalog taskCatalog);

    Optional<TaskCatalog> findById(int id);

    List<TaskCatalog> findAll();

    void delete(int id);
}
