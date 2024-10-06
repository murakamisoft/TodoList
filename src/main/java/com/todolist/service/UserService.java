package com.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.model.User;
import com.todolist.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    // ユーザーを名前またはメールアドレスで検索
    public List<User> searchUsers(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return findAllUsers();
        }
        return userRepository.searchUsers(keyword);
    }
}
