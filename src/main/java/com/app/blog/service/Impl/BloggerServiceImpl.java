package com.app.blog.service.Impl;

import com.app.blog.model.Blogger;
import com.app.blog.repository.BloggerRepository;
import com.app.blog.service.BloggerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BloggerServiceImpl implements BloggerService {
    private final BloggerRepository bloggerRepository;

    public BloggerServiceImpl(BloggerRepository bloggerRepository) {
        this.bloggerRepository = bloggerRepository;
    }

    @Override
    public Blogger create(Blogger blogger) {
        return bloggerRepository.save(blogger);
    }

    @Override
    public void delete(Long id) {
        bloggerRepository.deleteById(id);
    }

    @Override
    public List<Blogger> findAll() {
        return bloggerRepository.findAll();
    }

    @Override
    public Optional<Blogger> findById(Long id) {
        return bloggerRepository.findById(id);
    }

    @Override
    public Blogger update(Blogger blogger) {
        return bloggerRepository.save(blogger);
    }
}
