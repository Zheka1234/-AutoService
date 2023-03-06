package com.miskevich.service.position;

import com.miskevich.domain.Position;
import com.miskevich.repository.PositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    @Override
    @Transactional
    public Position creat(Position position) {
        return positionRepository.save(position);
    }

    @Override
    @Transactional
    public Position update(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Optional<Position> findById(int id) {
        return positionRepository.findById(id);
    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        positionRepository.deleteById(id);

    }
}
