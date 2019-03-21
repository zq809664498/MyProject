package com.ouath2.zq.config;/*
 * Project: springboot-zq-oauth2
 *
 * File Created at 2019/3/20 14:58
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */


import com.ouath2.zq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * @author zhaoqi-ht
 * @Type com.ouath2.zq.config
 * @date ：Created in 2019/3/20 14:58
 */
@Configuration
@Slf4j
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    private final UserService userService;

    @Autowired
    public WebSecurityConfiguration(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        log.info("=====================WebSecurityConfiguration");
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());;

    }

}

