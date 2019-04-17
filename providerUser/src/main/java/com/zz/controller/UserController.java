package com.zz.controller;

import com.zz.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangzheng on 2019/3/27.
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable  long id){
        return new User(id);
    }
}
