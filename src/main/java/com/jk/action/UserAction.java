package com.jk.action;

import com.jk.model.User;
import com.jk.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by GKB on 2018/5/4.
 */
@Namespace("/")
@Action(value = "userAction")
public class UserAction extends BaseAction {

    @Autowired
    private UserService userService;

    public void QueryUser(){
        List<User> list = userService.QueryUser();
        super.writeJson(list);
    }

}
