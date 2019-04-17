package com.zz.controller;

import com.zz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangzheng on 2019/3/27.
 */
@RestController
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @Value("${user.url}")
    String url ;

    @GetMapping("/order/{id}")
    public User getUser(@PathVariable  long id){
        return restTemplate.getForObject(url+"user/"+id,User.class);
    }
}
