package com.minghao.microserviceuser.controller;

import com.minghao.microserviceuser.model.User;
import com.minghao.microserviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * CORS headers string helper
     *
     * @return CORS headers
     */
    private HttpHeaders getHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
        return headers;
    }

    /**
     * User registration
     * @param user User object to be created
     * @return ResponseEntity with the created Student object
     */
    @CrossOrigin
    @PostMapping("/register/user")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        // check if the user already exists
        if (userService.findOneUserByUsername(user.getUsername()) != null) {
            return new ResponseEntity<>(getHeader(), HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.save(user), getHeader(), HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("getting called");
        return "{\"message\": \"Hello Spring\"}";
    }
}