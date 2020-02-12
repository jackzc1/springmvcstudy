package com.soft.controller;

import com.soft.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
