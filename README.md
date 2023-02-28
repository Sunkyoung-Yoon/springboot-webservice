### springboot-webservice
# **스프링 부트와 AWS로 혼자 구현하는 웹 서비스**
****
소스코드 참고 https://github.com/jojoldu/freelec-springboot2-webservice

교재와 저자 블로그를 참고해 프로젝트를 진행하며 배운 내용 정리

개발환경
* gradle 6.7.1
* java 11.0.13


#### 1장 인텔리제이로 스프링 부트 시작하기
* [gradle 프로젝트를 springboot 프로젝트로 변경하기](https://chobo24.tistory.com/entry/spring-%EA%B7%B8%EB%A0%88%EC%9D%B4%EB%93%A4-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A5%BC-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A1%9C-%EB%B3%80%EA%B2%BD%ED%95%98%EA%B8%B0)
* 인텔리제이 깃허브 연동

#### 2장 스프링부트에서 테스트 코드를 작성하자
* [테스트 코드 작성 (lombok 사용)](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8%EC%97%90%EC%84%9C-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%BD%94%EB%93%9C-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0)
  
#### 3장 스프링부트에서 JPA로 데이터베이스 다뤄보자
* Spring Data JPA 적용 및 테스트
* 등록,수정,조회 API 작성
* h2 웹 콘솔 사용

[위 3가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-Spring-Data-JPA-%EC%A0%81%EC%9A%A9-%EB%B0%8F-%EB%93%B1%EB%A1%9D%EC%88%98%EC%A0%95%EC%A1%B0%ED%9A%8C-API-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0)
* [JPA Auditing으로 생성시간/수정시간 자동화](https://chobo24.tistory.com/entry/spring-JPA-Auditing-%EC%83%9D%EC%84%B1%EC%88%98%EC%A0%95%EC%8B%9C%EA%B0%84-%EC%9E%90%EB%8F%99%ED%99%94)

#### 4장 머스테치로 화면 구성하기
* 서버 템플릿 엔진과 클라이언트 템플릿 엔진 차이
* 게시글 등록 및 전체 조회 화면 (mustache로 화면 구성)
* js /css 선언 위치를 다르게 하는 이유 (조회속도 향상)
* js 객체를 만들어 사용하는 이유 (브라우저의 전역 변수 충돌문제를 회피)
* 게시글 수정,삭제 화면(mustache로 화면 구성)
