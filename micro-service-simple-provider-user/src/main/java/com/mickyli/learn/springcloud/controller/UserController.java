package com.mickyli.learn.springcloud.controller;

import com.mickyli.learn.springcloud.entity.User;
import com.mickyli.learn.springcloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liqian on 2017/6/7 0007.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
