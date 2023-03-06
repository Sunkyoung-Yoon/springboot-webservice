package com.project.webservice.domain.user;

import com.project.webservice.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    //기본키 생성을 데이터베이스에게 위임-> null로 넘기면 db가 AUTO_INCREMENT를 가져와 생성해준다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    /*
    JPA로 데이터베이스로 저장할 때, Enum 값을 어떤 형태로 저장할 지 결정 - 기본적으로 int로 된 숫자 저장
    숫자로 저장되면 데이터베이스에서 확인할 때, 그 값이 무슨 코드를 의미하는지 확인 어려움
    -> 그래서 문자열(EnumType.STRING)로 저장되도록 선언한다.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name, String email, String picture, Role role){
        this.name=name;
        this.email=email;
        this.picture=picture;
        this.role=role;
    }

    public User update(String name, String picture){
        this.name=name;
        this.picture=picture;

        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}
