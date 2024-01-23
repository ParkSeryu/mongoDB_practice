package com.example.mongodb_practice.repository;

import com.example.mongodb_practice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByName(String userName);
}
