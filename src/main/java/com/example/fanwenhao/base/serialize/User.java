package com.example.fanwenhao.base.serialize;

import java.io.Serializable;

/**
 * @Date 2020/6/9 18:07
 * @Version 1.0
 */
public class User implements Serializable {
    String name;
    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
