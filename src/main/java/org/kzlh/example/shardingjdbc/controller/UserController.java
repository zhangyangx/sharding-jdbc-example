package org.kzlh.example.shardingjdbc.controller;

import org.kzlh.example.shardingjdbc.entity.User;
import org.kzlh.example.shardingjdbc.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping
    public int save(@RequestBody User user) {
        return userService.save(user);
    }
}
