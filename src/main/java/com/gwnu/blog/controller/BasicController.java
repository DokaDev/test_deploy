package com.gwnu.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
    @GetMapping("/")
    public String Index() {
        return "Index";
    }

    @GetMapping("/about")
    public String About() {
        return "About";
    }
}