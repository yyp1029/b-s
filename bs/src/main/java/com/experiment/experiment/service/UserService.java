package com.experiment.experiment.service;

import com.experiment.experiment.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface UserService {
    ArrayList<User> getAllUser();

    void deleteUserById(Integer id);

    void addUser(User user);
}
