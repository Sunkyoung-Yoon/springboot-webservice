### springboot-webservice
# **스프링 부트와 AWS로 혼자 구현하는 웹 서비스**
****
소스코드 참고 https://github.com/jojoldu/freelec-springboot2-webservice

교재와 저자 블로그를 참고해 프로젝트를 진행하며 배운 내용 정리

개발환경
* sringboot 2.4.1
* gradle 6.7.1
* java 11.0.13


## 1장 인텔리제이로 스프링 부트 시작하기
* [gradle 프로젝트를 springboot 프로젝트로 변경하기](https://chobo24.tistory.com/entry/spring-%EA%B7%B8%EB%A0%88%EC%9D%B4%EB%93%A4-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A5%BC-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A1%9C-%EB%B3%80%EA%B2%BD%ED%95%98%EA%B8%B0)
* 인텔리제이 깃허브 연동
<br/>

## 2장 스프링부트에서 테스트 코드를 작성하자
* [테스트 코드 작성 (lombok 사용)](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8%EC%97%90%EC%84%9C-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%BD%94%EB%93%9C-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0)
<br/>  
  
## 3장 스프링부트에서 JPA로 데이터베이스 다뤄보자
* Spring Data JPA 적용 및 테스트
* 등록,수정,조회 API 작성
* h2 웹 콘솔 사용

[위 3가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-Spring-Data-JPA-%EC%A0%81%EC%9A%A9-%EB%B0%8F-%EB%93%B1%EB%A1%9D%EC%88%98%EC%A0%95%EC%A1%B0%ED%9A%8C-API-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0)
* [JPA Auditing으로 생성시간/수정시간 자동화](https://chobo24.tistory.com/entry/spring-JPA-Auditing-%EC%83%9D%EC%84%B1%EC%88%98%EC%A0%95%EC%8B%9C%EA%B0%84-%EC%9E%90%EB%8F%99%ED%99%94)
<br/>

## 4장 머스테치로 화면 구성하기
* [서버 템플릿 엔진과 클라이언트 템플릿 엔진 차이과 머스테치 사용법](https://chobo24.tistory.com/entry/spring-%EC%84%9C%EB%B2%84-%ED%85%9C%ED%94%8C%EB%A6%BF-%EC%97%94%EC%A7%84%EA%B3%BC-%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8-%ED%85%9C%ED%94%8C%EB%A6%BF-%EC%97%94%EC%A7%84-%EC%B0%A8%EC%9D%B4-feat-%EB%A8%B8%EC%8A%A4%ED%85%8C%EC%B9%98-%EC%82%AC%EC%9A%A9%EB%B2%95)
* 게시글 등록 및 전체 조회 화면 (mustache로 화면 구성)
* js /css 선언 위치를 다르게 하는 이유 (조회속도 향상)
* js 객체를 만들어 사용하는 이유 (브라우저의 전역 변수 충돌문제를 회피)
* 게시글 수정,삭제 화면(mustache로 화면 구성)

[위 4가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-%EA%B2%8C%EC%8B%9C%EA%B8%80-%EB%93%B1%EB%A1%9D-%EB%B0%8F-%EC%A0%84%EC%B2%B4-%EC%A1%B0%ED%9A%8C-%EB%AA%A9%EB%A1%9D-%EC%88%98%EC%A0%95-%EC%82%AD%EC%A0%9C-%ED%99%94%EB%A9%B4-%EA%B5%AC%ED%98%84)

<br/>
                          
## 5장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기
* 스프링 시큐리티, 스프링 부트 1.5와 스프링부트2.0
* 구글 서비스 등록 및 스프링시큐리티 이용한 구글 로그인 연동
  * [구글 계정 이름이 아닌 pc 사용자 이름이 노출되는 문제](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%EA%B5%AC%EA%B8%80-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EC%97%B0%EB%8F%99-%EC%8B%9C-%EA%B5%AC%EA%B8%80-%EA%B3%84%EC%A0%95-%EC%9D%B4%EB%A6%84%EC%9D%B4-%EC%95%84%EB%8B%8C-%EB%A1%9C%EC%BB%AC-%EA%B3%84%EC%A0%95%EC%9D%B4-%EB%85%B8%EC%B6%9C%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0) - 윈도우에서 userName은 pc 사용자 이름을 의미하기 때문에 발생   

[위 2가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0%EC%99%80-OAuth20%EC%9C%BC%EB%A1%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-%EA%B5%AC%EA%B8%80-%EB%A1%9C%EA%B7%B8%EC%9D%B8)
* [어노테이션 기반으로 개선 및 세션 저장소로 jdbc 등록](https://chobo24.tistory.com/entry/spring-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-%EA%B8%B0%EB%B0%98%EC%9C%BC%EB%A1%9C-%EA%B0%9C%EC%84%A0-%EB%B0%8F-%EC%84%B8%EC%85%98-%EC%A0%80%EC%9E%A5%EC%86%8C%EB%A1%9C-jdbc-%EB%93%B1%EB%A1%9D)
* [네이버 API 등록 및 네이버 로그인 연동](https://chobo24.tistory.com/entry/spring-%EB%84%A4%EC%9D%B4%EB%B2%84-%EB%A1%9C%EA%B7%B8%EC%9D%B8)
* [기존 테스트에 시큐리티 적용하기](https://chobo24.tistory.com/entry/spring-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%EA%B8%B0%EC%A1%B4-%ED%85%8C%EC%8A%A4%ED%8A%B8%EC%97%90-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0-%EC%A0%81%EC%9A%A9%ED%95%98%EA%B8%B0-feat-%EC%B1%85%EA%B3%BC-%EB%8B%AC%EB%A6%AC-%ED%85%8C%EC%8A%A4%ED%8A%B8-4%EA%B0%9C-%EC%8B%A4%ED%8C%A8%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0)
  * 책과 달리 기존 테스트가 4개만 실패한 이유
    * main폴더의 application.properties에 application-oauth.properties를 포함하도록 하는 코드를 작성해두어서 test 폴더에서 application-oauth.properties까지만 읽을 수 있음에도 소셜 로그인 관련 값들을 가져올 수 있게 되었기 때문
<br/>
  
## 6장 AWS 서버 환경을 만들어보자 - AWS EC2
* AWS와 클라우드 서비스
* EC2 인스턴스 생성 및 EC2 서버 접속
  * **탄력적 IP**
    * AWS 고정 IP로, 인스턴스를 재시작하면 새로 IP를 할당받기 때문에 PC 접근할 때마다 주소를 확인하는 문제 해결
  * **pem 키**
    * 인스턴스 접근을 위해 pem키(비밀키)가 필요, 인스턴스는 지정된 pem키와 매칭되는 공개키를 가지고 있어 해당 pem 키 외에는 접근을 허용하지 않는다.
* 리눅스 서버 생성시 필요한 설정 (Java 설치, 타임존 변경, 호스트 네임 변경)
  * 책과 달리 Java 11 설치 및 호스트네임 Amazon Linux2 명령어 사용해서 변경
  
[위 3가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-AWS-%EC%84%9C%EB%B2%84-%ED%99%98%EA%B2%BD-%EA%B5%AC%EC%B6%95%ED%95%98%EA%B8%B0-AWS-EC2-window-EC2-%EC%A0%91%EC%86%8D)

<br/>

## 7장 AWS에서 데이터베이스 환경을 만들어보자 - AWS RDS
* [RDS와 RDS 인스턴스 생성 및 RDS로 서비스할 경우 필수로 해야 하는 설정들](https://chobo24.tistory.com/entry/spring-AWS%EC%97%90-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4-%ED%99%98%EA%B2%BD-%EA%B5%AC%EC%B6%95-AWS-RDSMariaDB-%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4-%EC%83%9D%EC%84%B1-%EB%B0%8F-%ED%8C%8C%EB%9D%BC%EB%AF%B8%ED%84%B0-%EC%84%A4%EC%A0%95)
  * **RDS**
    * AWS에서 지원하는 클라우드기반 관계형 데이터베이스로 잦은 운영 작업들이 자동화되어 있다. 예상치 못한 양의 데이터가 쌓여도 추가 요금만 내면 정상적으로 서비스 가능
  * **MariaDB 선택 이유**
    * 오픈소스로 상용 데이버테이스보다 동일한 사양 대비 가격이 낮다.
    * Amazon Aurora로 교체가 용이하다. (MySQL 기반으로 만들어졌기 때문)
    * MySQL 대비 동일 하드웨어일 때, 향상된 성능을 발휘하며, 활성화된 커뮤니티와 다양한 기능, 스토리지 엔진을 보유
* [인텔리제이 커뮤니티 버전으로 RDS 등록 및 EC2와 등록한 RDS 연동 체크](https://chobo24.tistory.com/entry/spring-AWS%EC%97%90-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4-%ED%99%98%EA%B2%BD-%EA%B5%AC%EC%B6%95-%EB%82%B4-PC%EC%97%90%EC%84%9C-RDS-%EC%A0%91%EC%86%8D%EA%B3%BC-RDS%EC%99%80-EC2%EC%9D%98-%EC%97%B0%EB%8F%99-%ED%99%95%EC%9D%B8)
<br/>

## 8장 EC2 서버에 프로젝트를 배포해보자
* EC2에 프로젝트 Clone 받기
  * 클론된 프로젝트 코드 테스트(./gradlew test) 중 발생한 에러 원인 및 해결
    * [Execution failed for task ':compileJava'.](https://chobo24.tistory.com/entry/spring-gradlew-test-%EC%98%A4%EB%A5%98-FAILURE-Build-failed-with-an-exception-Execution-failed-for-task-compileJava%EC%97%90%EB%9F%AC-%ED%95%B4%EA%B2%B0)
    * [Execution failed for task ':test'.](https://chobo24.tistory.com/entry/spring-gradle-test-%EC%98%A4%EB%A5%98-Execution-failed-for-task-test-There-were-failing-tests-%ED%95%B4%EA%B2%B0)
* 배포 스크립트 만들기
  * 배포때마다 매번 과정을 거치는 것은 불편하기 때문에, 쉘 스크립트를 작성한다. 
* 외부 Security 파일 등록
  * 로컬에 있는 application-oauth.prorperties는 .gitignore로 git에서 제외 대상으로 깃허브에 없기 때문에, 서버가 직접 이 설정을 가지도록 application-oauth.prorperties를 생성해주어야 한다.

[위 3가지 배운 내용 정리](https://chobo24.tistory.com/entry/spring-EC2-%EC%84%9C%EB%B2%84%EC%97%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-EC2%EC%97%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-Clone-%EB%B0%8F-%EB%B0%B0%ED%8F%AC-%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-%EC%9E%91%EC%84%B1%EC%99%B8%EB%B6%80-Security-%ED%8C%8C%EC%9D%BC-%EB%93%B1%EB%A1%9D)
* [스프링부트 프로젝트로 RDS 접근 및 EC2에서 소셜 로그인](https://chobo24.tistory.com/entry/spring-EC2-%EC%84%9C%EB%B2%84%EC%97%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A1%9C-RDS-%EC%A0%91%EA%B7%BC-%EB%B0%8F-EC2%EC%97%90%EC%84%9C-%EC%86%8C%EC%85%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8)
<br/>
  
## 9장 코드가 푸시되면 자동으로 배포해보자 - Travis CI 배포 자동화
* CI
  * 지속적 통합, 코드 버전을 관리하는 시스템에 푸시가 되면 자동으로 테스트, 빌드가 수행되어 안정적인 배포 파일을 만든다.
* CD
  * 지속적인 배포, 위 빌드 결과를 자동으로 운영 서버에 무중단 배포까지 진행되는 과정
* Travis CI
  * 깃허브에서 제공하는 무료 CI 서비스
* [Travis CI와 프로젝트, Travis CI와 AWS S3 연동](https://chobo24.tistory.com/entry/spring-Travis-CI-%EB%B0%B0%ED%8F%AC-%EC%9E%90%EB%8F%99%ED%99%94-Travis-CI%EC%99%80-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-Travis-CI%EC%99%80-AWS-S3-%EC%97%B0%EB%8F%99)
* [Travis CI와 AWS S3, CodeDeploy 연동](https://chobo24.tistory.com/entry/Travis-CI-%EB%B0%B0%ED%8F%AC-%EC%9E%90%EB%8F%99%ED%99%94-Travis-CI%EC%99%80-AWS-S3-CodeDeploy-%EC%97%B0%EB%8F%99)
   
<br/>

## 10장 EC2 서버에 프로젝트를 배포해보자 - 24시간 365일 중단 없는 서비스를 만들자
