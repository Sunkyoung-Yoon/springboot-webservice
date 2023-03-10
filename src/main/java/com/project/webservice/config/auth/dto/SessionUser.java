package com.project.webservice.config.auth.dto;

import com.project.webservice.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    //인증된 사용자 정보만 필요
    public SessionUser(User user){
        this.name=user.getName();
        this.email=user.getEmail();
        this.picture=user.getPicture();
    }
}
