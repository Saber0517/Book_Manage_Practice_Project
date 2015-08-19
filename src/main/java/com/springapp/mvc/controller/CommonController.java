package com.springapp.mvc.controller;

import com.springapp.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WhiteSaber on 15/8/18.
 */
@Controller
public class CommonController {
//    @RequestMapping(value = "/book")
//    public String BookList() {
//        return "book";
//    }

    @RequestMapping(value = {"/panel"})
    public String panel() {
        return "panel";
    }

    /**
     * 后台和页面通过form 标签库
     *
     * @param user
     * @return
     */
    @RequestMapping(value = {"/form"})
    public String form(@ModelAttribute("u") User user) {
        user.setAge("22");
        user.setUname("james");
        return "form";
    }
}
