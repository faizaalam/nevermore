package com.app.blog.service;

import com.app.blog.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User user);

    void delete(Long id);

    List<User> findAll();

    Optional<User> findById(Long id);

    User update(User user);
}
