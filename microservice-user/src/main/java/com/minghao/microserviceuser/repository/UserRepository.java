package com.minghao.microserviceuser.repository;

import com.minghao.microserviceuser.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<Object> findOneUserBy_id(ObjectId objectId);

    Optional<Object> findOneUserByUsername(String username);
}
