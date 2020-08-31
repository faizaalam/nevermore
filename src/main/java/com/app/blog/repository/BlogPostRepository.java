package com.app.blog.repository;

import com.app.blog.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface BlogPostRepository extends MongoRepository<BlogPost, Long> {
}
