package com.example.demo.service;

import com.example.demo.config.AppConfig;
import com.example.demo.model.IUser;
import com.example.demo.model.IUserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    //private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    private final IUser userMapper;

    public UserService(IUser userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUsers(){

        //return context.getBean(IUser.class).getAllUsers();
        return userMapper.getAllUsers();
    }

}
