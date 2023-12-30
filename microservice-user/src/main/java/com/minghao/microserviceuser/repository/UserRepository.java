package com.minghao.microserviceuser.repository;

import com.minghao.microserviceuser.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
