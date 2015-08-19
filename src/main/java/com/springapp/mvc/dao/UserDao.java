package com.springapp.mvc.dao;

import com.springapp.mvc.entity.User;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public interface UserDao extends BaseDao {

    public List<User> getUserList();

    public String searchUser(User loginUser);
}
