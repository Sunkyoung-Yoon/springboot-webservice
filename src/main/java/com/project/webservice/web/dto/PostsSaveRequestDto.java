package com.project.webservice.web.dto;

import com.project.webservice.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Entity 클래스를 Request/Response 클래스로 사용해서는 안된다. ->데이터베이스와 맞닿아있어 변경시 여러 클래스에 영향을 끼치기 때문
//Request/Response는 View를 위한 클래스로 자주 변경되기 때문에 Controller에서 사용할 dto를 따로 분리해줘야 한다.
@Getter
//기본 생성자 자동 추가 public Posts() {}
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
