package com.app.blog.repository;

import com.app.blog.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
