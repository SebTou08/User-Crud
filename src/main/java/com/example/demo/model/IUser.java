package com.example.demo.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface IUser {
    @Select("SELECT * FROM prueba_users")
    List<User> getAllUsers();
}
