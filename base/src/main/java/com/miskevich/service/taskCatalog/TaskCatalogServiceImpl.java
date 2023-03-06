package com.miskevich.service.taskCatalog;

import com.miskevich.domain.TaskCatalog;
import com.miskevich.repository.TaskCatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskCatalogServiceImpl implements TaskCatalogService {

    private final TaskCatalogRepository taskCatalogRepository;

    @Override
    @Transactional
    public TaskCatalog creat(TaskCatalog taskCatalog) {
        return taskCatalogRepository.save(taskCatalog);
    }

    @Override
    @Transactional
    public TaskCatalog update(TaskCatalog taskCatalog) {
        return taskCatalogRepository.save(taskCatalog);
    }

    @Override
    public Optional<TaskCatalog> findById(int id) {
        return taskCatalogRepository.findById(id);
    }

    @Override
    public List<TaskCatalog> findAll() {
        return taskCatalogRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {

        taskCatalogRepository.deleteById(id);
    }
}
