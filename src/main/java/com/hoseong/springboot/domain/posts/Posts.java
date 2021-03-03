package com.hoseong.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 클래스 내 모든 필드의 getter 메소드 생성
@NoArgsConstructor  // 기본 생성장 자동 추가(= public Posts() {})
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id // 해당 테이블의 PK필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // PK생성 규칙, GenerationType.IDENTITY 옵션을 추가해야만 auto_increment값 자동 증가)가 됨
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 컬럼을 나타내며 생략 가능
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    // 해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}