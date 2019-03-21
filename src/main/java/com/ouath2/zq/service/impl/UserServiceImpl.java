package com.ouath2.zq.service.impl;/*
 * Project: springboot-zq-oauth2
 *
 * File Created at 2019/3/20 14:54
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */


import com.ouath2.zq.bean.UserDetails;
import com.ouath2.zq.bean.User;
import com.ouath2.zq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zhaoqi-ht
 * @Type com.ouath2.zq.service.impl
 * @date ：Created in 2019/3/20 14:54
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private  PasswordEncoder passwordEncoder;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /*模拟数据库操作*/
        User user = new User();
        user.setUsername("10086");
        user.setPassword(passwordEncoder.encode("123456"));
        log.info("==============================================UserServiceImpl:"+passwordEncoder.encode("123456"));
        return new UserDetails(user);

    }


}
