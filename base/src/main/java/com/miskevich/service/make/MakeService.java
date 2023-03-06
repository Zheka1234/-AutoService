package com.miskevich.service.make;

import com.miskevich.domain.Make;


import java.util.List;
import java.util.Optional;

public interface MakeService {

    Make creat(Make make);

    Make update(Make make);

    Optional<Make> findById(int id);

    List<Make> findAll();

    void delete(int id);
}
