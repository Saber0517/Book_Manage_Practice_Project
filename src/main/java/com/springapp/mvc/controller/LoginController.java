package com.springapp.mvc.controller;

import com.springapp.mvc.entity.Food;
import com.springapp.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
@Controller
@SessionAttributes(value = {"currentUser", "shoppingList"})
public class LoginController {

    //    @ModelAttribute(value = "currentUser")
    @RequestMapping(value = {"login.actoin"}, produces = {"charset=UTF-8"})
    public String requarLogin(User user, Model model, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println(user.getUname());
        System.out.println(user.getPwd());
        model.addAttribute("currentUser", user);
        model.addAttribute("shoppingList", new LinkedList<Food>());
//        httpServletResponse.sendRedirect("book.jsp");
//        return "redirect:/book";
        return "redirect:/panel";
    }




}
