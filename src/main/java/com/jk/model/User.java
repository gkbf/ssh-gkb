package com.jk.model;

import java.io.Serializable;

/**
 * Created by GKB on 2018/5/4.
 */
public class User implements Serializable {

    private  Integer  id;
    private  String   name;
    private  Integer  sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
