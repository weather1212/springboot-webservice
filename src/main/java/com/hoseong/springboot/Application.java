package com.hoseong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 활성화
// @SpringBootApplication : 스프링 부트의 가장 기본적인 설정을 선언해줌 (스프링 Bean 읽기와 생성을 모두 자동으로 설정)
// @SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 XXXApplication.java 클래스는 항상 프로젝트 최상단에 위치
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // SpringApplication.run()으로 내장 WAS를 실행
    }
}