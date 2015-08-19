package com.springapp.mvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
//@RequestMapping("/suc")
@Controller
public class CommmonController {
    //    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("ModelAndView");
//        ModelAndView mv = new ModelAndView("Jhon", "uname", "Jhon");
//        return mv;
//    }
    @RequestMapping(value = "/showMyName")
    public ModelAndView showMyName(String name) throws Exception {
        System.out.println("ModelAndView");
        ModelAndView mv = new ModelAndView("Jhon", "uname", name);
        return mv;
    }

    @RequestMapping(value = "/showMyUser")
    public String showMyUser(String name, Model model) throws Exception {
        System.out.println("ModelAndView");
        model.addAttribute("uname", name);
//        ModelAndView mv = new ModelAndView("Jhon", "uname", name);
        return "Jhon";
    }

    @ModelAttribute(value ="un")
    public String getUname() {
        return "ModuleAttributes..";
    }
}
