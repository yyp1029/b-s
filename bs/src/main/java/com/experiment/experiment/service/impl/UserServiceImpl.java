package com.experiment.experiment.service.impl;

import com.experiment.experiment.entity.User;
import com.experiment.experiment.mapper.UserMapper;
import com.experiment.experiment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ArrayList<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
