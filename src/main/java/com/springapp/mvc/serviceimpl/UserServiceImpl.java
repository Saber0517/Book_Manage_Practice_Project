package com.springapp.mvc.serviceimpl;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.UserService;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public String searchUser(User loginUser) {
        return "searching...";
    }
}
