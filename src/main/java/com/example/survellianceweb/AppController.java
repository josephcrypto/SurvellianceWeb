package com.example.survellianceweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/price")
    public String price() {
        return "price";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/team")
    public String team(){
        return "team";
    }

    @GetMapping("/testimonial")
    public String testimonial() {
        return "testimonial";
    }
}



