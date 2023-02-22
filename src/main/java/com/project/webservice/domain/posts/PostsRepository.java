package com.project.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//interface 생성 후 JpaRepository<Entity 클래스, PK 타입>을 상속받으면 자동으로 기본적인 CRUD 메소드 생성된다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
