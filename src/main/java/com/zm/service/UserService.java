package com.zm.service;

import com.zm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getUserList();

    boolean addUser(User user);

    boolean deleteUserByName(String userName);

    boolean updateUser(Map map);

    User queryUserByName(String userName);
}
