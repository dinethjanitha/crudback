package com.example.crudback.repo;

import com.example.crudback.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User , String> {
}
