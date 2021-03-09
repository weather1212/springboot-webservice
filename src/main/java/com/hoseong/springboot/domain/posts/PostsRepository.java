package com.hoseong.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JpaRepository<Entity클래스, PK타입> 상속 (기본 CRUD 메소드 자동 생성)
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")  // SpringDataJpa 에서 제공하지 않는 메소드는 @Query를 사용해도 됨
    List<Posts> findAllDesc();
}