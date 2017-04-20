package com.storm.controller;

import com.storm.pojo.User;
import com.storm.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cj34920 on 2017/2/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/showUser")
    private String getUserInfo(Model model) {
        List<User> listUser = userService.getUserInfo();
        System.out.println(listUser.get(0).getUser_name());
        logger.info("Öµ£º" + listUser.get(0).getUser_name());
        model.addAttribute("user", listUser.get(0));
        return "index";
    }
}
