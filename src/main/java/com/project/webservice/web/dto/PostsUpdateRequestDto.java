package com.project.webservice.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//기본 생성자 자동 추가 public Posts(){}
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto (String title, String content){
        this.title=title;
        this.content=content;
    }
}
