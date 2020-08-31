package com.app.blog.service;

import com.app.blog.model.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Admin create(Admin admin);

    void delete(Long id);

    List<Admin> findAll();

    Optional<Admin> findById(Long id);

    Admin update(Admin admin);
}
