package com.app.blog.service;

import com.app.blog.model.Blogger;

import java.util.List;
import java.util.Optional;

public interface BloggerService {
    Blogger create(Blogger blogger);

    void delete(Long id);

    List<Blogger> findAll();

    Optional<Blogger> findById(Long id);

    Blogger update(Blogger blogger);
}
