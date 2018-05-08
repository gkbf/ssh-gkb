package com.jk.service.impl;

import com.jk.dao.UserDao;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GKB on 2018/5/4.
 */
@Service("/UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    public List<User> QueryUser() {
        return userDao.QueryUser();
    }
}
