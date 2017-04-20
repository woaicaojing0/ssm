package com.storm.serviceImpl;


import com.storm.dao.IUserDao;
import com.storm.pojo.User;
import com.storm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cj34920 on 2017/2/14.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;
    public List<User> getUserInfo() {
        return userDao.getUserInfo();
    }
}
