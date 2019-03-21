package com.ouath2.zq.bean;/*
 * Project: springboot-zq-oauth2
 *
 * File Created at 2019/3/20 14:55
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */


import java.util.Collections;

/**
 * @author zhaoqi-ht
 * @Type com.ouath2.zq.bean
 * @date ：Created in 2019/3/20 14:55
 */
public class UserDetails extends org.springframework.security.core.userdetails.User {
    private User user;

    public UserDetails(User user) {
        super(user.getUsername(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
