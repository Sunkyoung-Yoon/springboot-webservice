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
* [서버 템플릿 엔진과 클라이언트 템플릿 엔진 차이과 머스테치 사용법](https://chobo24.tistory.com/entry/spring-%EC%84%9C%EB%B2%84-%ED%85%9C%ED%94%8C%EB%A6%BF-%EC%97%94%EC%A7%84%EA%B3%BC-%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8-%ED%85%9C%ED%94%8C%EB%A6%BF-%EC%97%94%EC%A7%84-%EC%B0%A8%EC%9D%B4-feat-%EB%A8%B8%EC%8A%A4%ED%85%8C%EC%B9%98-%EC%82%AC%EC%9A%A9%EB%B2%95)
* 게시글 등록 및 전체 조회 화면 (mustache로 화면 구성)
* js /css 선언 위치를 다르게 하는 이유 (조회속도 향상)
* js 객체를 만들어 사용하는 이유 (브라우저의 전역 변수 충돌문제를 회피)
* 게시글 수정,삭제 화면(mustache로 화면 구성)

[위 4가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-%EA%B2%8C%EC%8B%9C%EA%B8%80-%EB%93%B1%EB%A1%9D-%EB%B0%8F-%EC%A0%84%EC%B2%B4-%EC%A1%B0%ED%9A%8C-%EB%AA%A9%EB%A1%9D-%EC%88%98%EC%A0%95-%EC%82%AD%EC%A0%9C-%ED%99%94%EB%A9%B4-%EA%B5%AC%ED%98%84)

#### 5장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기
* 스프링 시큐리티, 스프링 부트 1.5와 스프링부트2.0
* 구글 서비스 등록 및 스프링시큐리티 이용한 구글 로그인 연동
  * [구글 계정 이름이 아닌 pc 사용자 이름이 노출되는 문제](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%EA%B5%AC%EA%B8%80-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EC%97%B0%EB%8F%99-%EC%8B%9C-%EA%B5%AC%EA%B8%80-%EA%B3%84%EC%A0%95-%EC%9D%B4%EB%A6%84%EC%9D%B4-%EC%95%84%EB%8B%8C-%EB%A1%9C%EC%BB%AC-%EA%B3%84%EC%A0%95%EC%9D%B4-%EB%85%B8%EC%B6%9C%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0) - 윈도우에서 userName은 pc 사용자 이름을 의미하기 때문에 발생   

[위 2가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0%EC%99%80-OAuth20%EC%9C%BC%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-%EA%B5%AC%EA%B8%80-%EB%A1%9C%EA%B7%B8%EC%9D%B8)
* [어노테이션 기반으로 개선 및 세션 저장소로 jdbc 등록](https://chobo24.tistory.com/entry/spring-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-%EA%B8%B0%EB%B0%98%EC%9C%BC%EB%A1%9C-%EA%B0%9C%EC%84%A0-%EB%B0%8F-%EC%84%B8%EC%85%98-%EC%A0%80%EC%9E%A5%EC%86%8C%EB%A1%9C-jdbc-%EB%93%B1%EB%A1%9D)
* [네이버 API 등록 및 네이버 로그인 연동](https://chobo24.tistory.com/entry/spring-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-%EA%B8%B0%EB%B0%98%EC%9C%BC%EB%A1%9C-%EA%B0%9C%EC%84%A0-%EB%B0%8F-%EC%84%B8%EC%85%98-%EC%A0%80%EC%9E%A5%EC%86%8C%EB%A1%9C-jdbc-%EB%93%B1%EB%A1%9D) 
