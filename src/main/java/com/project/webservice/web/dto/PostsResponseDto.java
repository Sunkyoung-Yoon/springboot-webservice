package com.project.webservice.web.dto;

import com.project.webservice.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    //PostsResponseDto는 Entity 필드 중 일부만 사용 -> 모든 필드를 가진 생성자 불필요 -> 생성자로 Entity를 받아서 필드에 값 대입
    public PostsResponseDto(Posts entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
    }
}
