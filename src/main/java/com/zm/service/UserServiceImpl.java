package com.zm.service;

import com.zm.mapper.UserMapper;
import com.zm.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {


    @Override
    public List<User> getUserList() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUserList();
    }

    @Override
    public boolean addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        if (mapper.addUser(user)==1) return true;

        return false;
    }

    @Override
    public boolean deleteUserByName(String userName) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        int i = mapper.deleteUserByName(userName);
        if (i==1)return true;
        return false;
    }

    @Override
    public boolean updateUser(Map map) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        int i = mapper.updateUser(map);
        if (i>=1)return true;
        return false;

    }

    @Override
    public User queryUserByName(String userName) {
        return null;
    }
}
