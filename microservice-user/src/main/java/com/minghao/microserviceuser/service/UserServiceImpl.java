package com.minghao.microserviceuser.service;

import com.minghao.microserviceuser.model.User;
import com.minghao.microserviceuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOneUserByUserId(String userId) {
        return null;
    }

    @Override
    public User findOneUserByUsername(String username) {
        return (User) userRepository.findOneUserByUsername(username).orElse(null);
    }

    @Override
    public User save(User user) {
        return mongoTemplate.insert(user);
    }

}
