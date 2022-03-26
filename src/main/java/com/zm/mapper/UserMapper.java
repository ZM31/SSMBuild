package com.zm.mapper;

import com.zm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    int addUser(User user);

    int deleteUserByName(String userName);

    int updateUser(Map map);

    User queryUserByName(String userName);
}
