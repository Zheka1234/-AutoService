package com.miskevich.service.position;

import com.miskevich.domain.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {

    Position creat(Position position);

    Position update(Position position);

    Optional<Position> findById(int id);

    List<Position> findAll();

    void delete(int id);
}
