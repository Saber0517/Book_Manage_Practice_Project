package com.springapp.mvc.controller;

import com.springapp.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by WhiteSaber on 15/8/18.
 */
@Controller
public class PanelController {


    @RequestMapping(value = {"/panel"})
    public String panel() {
        return "panel";
    }


    @RequestMapping(value = {"/userList"})
    @ResponseBody
    public List<User> getUserList(HttpServletResponse response) {
        //①表示响应的内容区数据的媒体类型为html格式，且编码为utf-8(客户端应该以utf-8解码)
//        response.setContentType("application/json;charset=utf-8");
        User u1 = new User();
        u1.setUname("中国人");
        u1.setId("1");
        u1.setPwd("123");
        List<User> userList = new LinkedList<User>();
        userList.add(u1);
        User u2 = new User();
        u2.setUname("日本人");
        u2.setId("2");
        u2.setPwd("321");
        userList.add(u2);
        User u3 = new User();
        u3.setId("3");
        u3.setPwd("543");
        u3.setUname("白斩鸡");
        userList.add(u3);

        return userList;

    }

}
