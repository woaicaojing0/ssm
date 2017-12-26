package com.storm.test;

import com.storm.pojo.User;
import com.storm.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author cj34920
 *         Date: 2017/12/26
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:mybatis-config.xml"})
public class JunitTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void getinfo() {
        List<User> users = userService.getUserInfo();
        for (User user : users) {
            System.out.println(user.getUser_name());
        }
    }
}
