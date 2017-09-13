package com.storm.MainTest;

import com.storm.pojo.User;
import com.storm.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by cj34920 on 2017/2/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = LoggerFactory.getLogger(TestMyBatis.class);
      private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

  @Before
  public void before() {
      ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
      userService = (IUserService) ac.getBean("userService");
  }

    @Test
    public void test1() {
        List<User> user = userService.getUserInfo();
         System.out.println(user.get(0).getUser_name());
         logger.info("值："+user.get(0).getUser_name());
    }
}
