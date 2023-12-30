package com.minghao.microserviceuser.service;

import com.minghao.microserviceuser.model.User;

import java.util.ArrayList;

public interface UserService {

    User findUserByUserId(String userId);

    User findUserByUserName(String username);


    Object save(User user);
}
