package com.hoseong.springboot.web;

import com.hoseong.springboot.service.posts.PostsService;
import com.hoseong.springboot.web.dto.PostsResponseDto;
import com.hoseong.springboot.web.dto.PostsSaveRequestDto;
import com.hoseong.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor    // 생성자를 통한 Bean 객체 주입
@RestController
public class PostsApiController {

    private final PostsService postsService;

    // 삽입
    @PostMapping("/api/v1/posts")
    public Long Save(@RequestBody PostsSaveRequestDto requestDto) {

        return postsService.save(requestDto);
    }

    // 수정
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {

        return postsService.update(id, requestDto);
    }

    // 조회
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {

        return postsService.findById(id);
    }
}