package com.miskevich.service.schedule;

import com.miskevich.domain.Schedule;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {


    Schedule creat(Schedule schedule);

    Schedule update(Schedule schedule);

    Optional<Schedule> findById(int id);

    List<Schedule> findAll();

    void delete(int id);
}
