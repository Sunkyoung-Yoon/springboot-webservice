package com.project.webservice.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
//기본 생성자 자동 추가 public Posts() {}
@NoArgsConstructor
//주요 어노테이션인 Entity를 더 클래스에 가깝게 위치 -> 코틀린등의 새 언어 전환으로 롬북이 필요없을 때, 제거하기 용이
@Entity
public class Posts {

    //table PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //시스템에서 저장하는 id

    //@Column 생략 가능하나 기본값을 다르게 변경하고자 할 때 사용 - ex) VARCHAR(255) VARCHAR(500)
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    //클래스의 빌더 패턴 클래스 생성, 생성자 상단에 선언하면 생성자에 포함된 필드만 빌더에 포함
    @Builder
    public Posts(String title, String content, String author) {
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title, String content){
        this.title=title;
        this.content=content;
    }
}
