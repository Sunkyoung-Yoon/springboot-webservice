package com.project.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//프로젝트의 메인클래스
/*
@SpringBootApplication이 있는 위치부터 설정을 읽음
-> Application 클래스는 프로젝트 최상단에 위치해야 함
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
