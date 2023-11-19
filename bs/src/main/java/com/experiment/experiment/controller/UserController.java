package com.experiment.experiment.controller;

import com.experiment.experiment.Result.Result;
import com.experiment.experiment.entity.User;
import com.experiment.experiment.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Result getAllUser(){
        ArrayList<User> result = userService.getAllUser();
        return Result.success(result);
    }

    @PostMapping
    public Result updateUserById(@RequestBody User user){
        userService.addUser(user);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
        return Result.success();
    }
}
