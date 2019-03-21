package com.ouath2.zq.bean;/*
 * Project: springboot-zq-oauth2
 *
 * File Created at 2019/3/20 14:53
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */


import java.io.Serializable;

/**
 * @author zhaoqi-ht
 * @Type com.ouath2.zq.bean
 * @date ：Created in 2019/3/20 14:53
 */
public class User implements Serializable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
