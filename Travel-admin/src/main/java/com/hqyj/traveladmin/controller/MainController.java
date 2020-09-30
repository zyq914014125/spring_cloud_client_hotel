package com.hqyj.traveladmin.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr.X
 **/
@Controller
public class MainController {
    @RequestMapping("/travel")
    public String index() {
        return "index";
    }

    @RequestMapping("/travel/routes")
    public String route() {
        return "route";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }


    @RequestMapping("/loginout")
    public String loginout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/travel";
    }
}
