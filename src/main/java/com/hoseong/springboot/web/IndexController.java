package com.hoseong.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index"; // mustache starter가 뷰리졸버 역할을 해줌
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}