package com.experiment.experiment.mapper;

import com.experiment.experiment.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {
    public ArrayList<User> getAllUser();

    void deleteUserById(Integer id);

    void addUser(User user);
}
