package com.springboot404.springboot_404;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

   // @RequestMapping("/admin")
   @RequestMapping("/secure")
    public String secure() {
        return "secure";
    }
}