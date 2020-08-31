package com.app.blog.repository;

import com.app.blog.model.Blogger;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface BloggerRepository extends MongoRepository<Blogger, Long> {
}
