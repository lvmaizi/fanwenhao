package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/7/1 16:57
 * @Version 1.0
 */
@RestController
public class FirstController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
    @RequestMapping("/test")
    public String test(){
        if (true)
        throw new RuntimeException("test");
        return "test success";
    }
//    @RequestMapping("/testSql")
//    public String testSql(){
//        jdbcTemplate.execute("select * from user");
//        return "test success";
//    }
}
