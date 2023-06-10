package org.kzlh.example.shardingjdbc.service;

import org.junit.jupiter.api.Test;
import org.kzlh.example.shardingjdbc.entity.User;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setName("🐱🐱");
        int save = userService.save(user);
        System.out.println(save);
    }
}