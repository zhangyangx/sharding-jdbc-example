package org.kzlh.example.shardingjdbc.service.impl;

import org.kzlh.example.shardingjdbc.entity.User;
import org.kzlh.example.shardingjdbc.mapper.UserMapper;
import org.kzlh.example.shardingjdbc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author yang.zhang 2023/6/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }
}
