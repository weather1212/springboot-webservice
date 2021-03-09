package com.hoseong.springboot.web;

import com.hoseong.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {  // model : 서버 템플릿 엔진에서 사용할 수 있는 객체를 저장할 수 있음
        model.addAttribute("posts", postsService.findAllDesc());
        return "index"; // mustache starter가 뷰리졸버 역할을 해줌
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}