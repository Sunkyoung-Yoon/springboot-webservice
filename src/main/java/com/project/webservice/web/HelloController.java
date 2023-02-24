package com.project.webservice.web;

import com.project.webservice.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러를 JSON을 반환하는 컨트롤러로
@RestController
public class HelloController {
    //@GetMapping - HTTP Method인 Get의 요청을 받을 수 있는 API
    //  /hello 요청이 오면 문자열 hello 리턴
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    // @RequestParam 외부에서 API로 넘긴 파라미터(이름이 name인)를 메소드 파라미터 name(String name)에 저장
    public HelloResponseDto helloDto(@RequestParam("name")String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
