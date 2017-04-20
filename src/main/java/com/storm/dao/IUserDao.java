package com.storm.dao;


import com.storm.pojo.User;

import java.util.List;

/**
 * Created by cj34920 on 2017/2/14.
 */
public interface IUserDao {
    List<User> getUserInfo();
}
