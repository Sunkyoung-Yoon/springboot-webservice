package com.project.webservice.web.posts;

import com.project.webservice.domain.posts.Posts;
import com.project.webservice.domain.posts.PostsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsRepositoryTest {
    //스프링이 관리하는 Bean을 주입받음
    @Autowired
    PostsRepository postsRepository;

    //Junit에서 단위테스트 끝날 때마다 수행되는 메소드로 지정
    //test가 종료될 때마다 저장한 데이터 비우기
    @AfterEach
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

    @Test
    public void BaseTimeEntity_등록() {
        //given
        LocalDateTime now = LocalDateTime.of(2023,2,23,0,0,0);
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>> createDate="+posts.getCreatedDate()+"   modifiedDate="+posts.getModifiedDate());
        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }
}
