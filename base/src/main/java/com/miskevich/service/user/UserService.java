package com.miskevich.service.user;

import com.miskevich.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User creat(User user);

    User update(User user);

    Optional<User> findById(int id);

    List<User> findAll();

    void delete(int id);
}
