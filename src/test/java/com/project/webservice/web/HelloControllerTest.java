package com.project.webservice.web;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//테스트 진행시 JUnit에 내장된 실행자말고 SpringExtension라는 스프링 실행자 사용
//스프링 부트 테스트와 JUnit 사이에 연결자 역할
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    //스프링이 관리하는 Bean을 주입받음
    @Autowired
    //웹 API를 테스트할 때 사용, 스프링 MVC 테스트의 시작점
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        //MockMvc를 통해 /hello 주소로 HTTP GET 요철
        mvc.perform(get("/hello"))
                //mvc.perform의 결과 검증 -> OK 즉, 200인지 아닌지 점검
                .andExpect(status().isOk())
                //mvc.perform의 결과 검증 -> Controller에서 hello를 리턴하는지 점검
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        //param - API 테스트시 사용될 요천 파라미터를 설정 (String값만 허용)
        mvc.perform(get("/hello/dto")
                        .param("name",name)
                        .param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                //jsonPath - JSON 응답값을 필드별로 검증하는 메소드
                //$기준으로 필드명 명시 ex)$.name
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
