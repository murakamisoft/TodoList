package com.todolist.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todolist.mapper.UserMapper;
import com.todolist.model.User;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    public List<User> searchUsers(String keyword) {
        return userMapper.searchUsers(keyword);
    }
}
