package com.project.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//interface 생성 후 JpaRepository<Entity 클래스, PK 타입>을 상속받으면 자동으로 기본적인 CRUD 메소드 생성된다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

    //SpringDatatJpa 제공하지 않는 메소드는 쿼리로 작성 가능, 아래의 경우는 제공되는 기본메소드로도 가능
    //쿼리는 가독성이 좋아 상황따라 선택해서 결정
    @Query("select p from Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
