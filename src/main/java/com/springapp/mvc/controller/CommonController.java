package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WhiteSaber on 15/8/18.
 */
@Controller
public class CommonController {
    @RequestMapping(value = "/book")
    public String BookList() {
        return "book";
    }

    @RequestMapping(value = {"/panel"})
    public String panel() {
        return "panel";
    }

    @RequestMapping(value = {"/login",""})
    public String login() {
        return "login";
    }
}
