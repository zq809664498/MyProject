package com.ouath2.zq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


    @Test
    public void contextLoads() {

    }
    @Test
    public void test89() {


        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode("123456");

        System.out.println("======="+encodedPassword);
    }


}
