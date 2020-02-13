package com.soft.controller;

import com.soft.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

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

    @RequestMapping(value = "/fileTest", method = RequestMethod.POST)
    public String jsonTest1(MultipartFile filename, HttpServletRequest request) {
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(realPath);
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String originalFilename = filename.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        String name = uuid +"_"+originalFilename;
        System.out.println(name);
        try {
            filename.transferTo(new File(file, name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 测试异常处理组件
     * @return
     */
    @RequestMapping(value = "/testerror")
    public String error() {
        int i = 1/0;
        return "success";
    }
}
