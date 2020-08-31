package com.app.blog.controller;

import com.app.blog.model.Blogger;
import com.app.blog.service.BloggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bloggers")

public class BloggerController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private  final BloggerService bloggerService;

    public BloggerController(BloggerService bloggerService) {
        this.bloggerService = bloggerService;
    }

    @GetMapping
    public List<Blogger> getAllBloggers() {
        LOG.info("Getting all bloggers.");
        return bloggerService.findAll();
    }

    @PostMapping
    public Blogger addNewBlogger(@RequestBody Blogger blogger) {
        LOG.info("Saving blogger.");
        return bloggerService.create(blogger);
    }
}
