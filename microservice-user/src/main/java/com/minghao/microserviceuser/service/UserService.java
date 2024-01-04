package com.minghao.microserviceuser.service;

import com.minghao.microserviceuser.model.User;

import java.util.ArrayList;

public interface UserService {

    User findOneUserByUserId(String userId);

    User findOneUserByUsername(String username);


    User save(User user);

}
