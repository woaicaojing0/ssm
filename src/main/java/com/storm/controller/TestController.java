package com.storm.controller;

import com.storm.ws.MyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by cj34920 on 2017/4/20.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Resource
    private MyHandler myHandler;

    @RequestMapping("/mongoTest")
    @ResponseBody
    private Object mongoTest() {
        Query query = new Query();
        Criteria criteria = Criteria.where("taskId").is(1);
        query.addCriteria(criteria);
        List<Map> result = mongoTemplate.find(query, Map.class, "zabbixHistory");
        return result;
    }

    @RequestMapping("/wstest")
    private String page() {
        return "wsTest";
    }

    @RequestMapping("/broadcast")
    private void broadcast() {
        myHandler.broadCast("Hello World");
    }
}
