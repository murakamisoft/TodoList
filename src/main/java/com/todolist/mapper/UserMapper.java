package com.todolist.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.todolist.model.User;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM m_user")
    List<User> findAllUsers();

    List<User> searchUsers(@Param("keyword") String keyword);
}
