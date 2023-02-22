package com.project.webservice.web.posts;

import com.project.webservice.domain.posts.Posts;
import com.project.webservice.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//테스트 진행시 JUnit에 내장된 실행자말고 SpringRunner라는 스프링 실행자 사용
//스프링 부트 테스트와 JUnit 사이에 연결자 역할
@RunWith(SpringRunner.class)
//별다른 설정 없이 실행하면 @SpringBootTest가 자동으로 H2 데이터베이스를 실행
@SpringBootTest
public class PostsRepositoryTest {
    //스프링이 관리하는 Bean을 주입받음
    @Autowired
    PostsRepository postsRepository;

    //Junit에서 단위테스트 끝날 때마다 수행되는 메소드로 지정
    //테스트 간 순서에 대한 의존관계가 없도록 하기 위함
    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        //테이블 post에 insert 또는 update 쿼리 실행 (id가 없다면 insert, 있다면 update)
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("aaa1234@gmail.com")
                .build());


        //when
        //findAll - 데이블 posts에 있는 모든 데이터를 조회해서 반환하는 메소드
        List<Posts> postsList = postsRepository.findAll();

        //then
        //처음으로 회원 저장 -> 인덱스 0에 위치
        Posts posts = postsList.get(0);
        //posts가 가지고 있는 title, content가  title,content와 일치하는 지 체크
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

    }
}
