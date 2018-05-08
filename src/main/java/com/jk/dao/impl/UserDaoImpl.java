package com.jk.dao.impl;

import com.jk.dao.UserDao;
import com.jk.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GKB on 2018/5/4.
 */

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

    @Autowired

    private SessionFactory sessionFactory;

    public List<User> QueryUser() {
        String hql = "from User";
        List list = sessionFactory.getCurrentSession().createQuery(hql).list();
        return list;
    }
}
