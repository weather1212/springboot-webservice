package com.hoseong.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)  // 스프링부트 테스트와 JUnit 사이의 연결자 역할
@WebMvcTest(controllers = HelloController.class)
// 선언할 경우 @Controller, @ControllerAdvice 등을 사용할 수 있음(단, @service, @Repository, @Component 등은 사용 불가)
public class HelloControllerTest {

    // 스프링이 관리하는 Bean 주입
    @Autowired
    private MockMvc mvc;    // 웹 API 테스트 시 사용, 스프링MVC 테스트의 시작점

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))   // MockMvc를 통해 /hello 주소로 HTTP GET 요청을 함
                .andExpect(status().isOk()) // HTTP의 Status를 검증
                .andExpect(content().string(hello));    // 응답 본문의 내용을 검증

    }


}
