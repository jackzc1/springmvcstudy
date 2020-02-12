package com.soft.controller;

import com.soft.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2020/2/12.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public String toSuccess(User user) {
        System.out.println(user);
        return "success";
    }

    /**
     * 最好用Post方式不让会因为参数中有{}报错
     * json数据测试
     * @param user
     * @return
     */
    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public @ResponseBody User jsonTest(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
}
