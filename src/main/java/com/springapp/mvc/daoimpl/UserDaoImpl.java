package com.springapp.mvc.daoimpl;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.entity.User;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public String searchUser(User loginUser) {
        return null;
    }
}
