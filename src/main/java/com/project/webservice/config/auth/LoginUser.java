package com.project.webservice.config.auth;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//이 어노테이션이 생성될 수 있는 위치 결정 - 메소드의 파라미터로 선언된 객체에서만 사용할 수 있도록 함
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
