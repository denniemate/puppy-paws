<div align=center>
	<img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=🐶&fontSize=50" />	
</div>

## PUPPY PAWS
![image](https://github.com/user-attachments/assets/3a98d3eb-e25d-4c5b-9986-71d117407a00)

https://www.puppy-paws.co.kr

# backend

## 기술 스택

### 개발
<div>
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=SpringSecurity&logoColor=white">
  <img src="https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens">
  <img src="https://img.shields.io/badge/JPA-007396?style=for-the-badge&logo=JPA&logoColor=white">
  <img src="https://img.shields.io/badge/QueryDSL-0854C1?style=for-the-badge&logo=QueryDSL&logoColor=white">
  <img src="https://img.shields.io/badge/OAuth 2.0-EC1C24?style=for-the-badge&logo=0auth&logoColor=white">
</div>

### DB
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)

### DevOps

<div>
  <img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white"> 
  <img src="https://img.shields.io/badge/Amazon%20EC2-FF9900?style=for-the-badge&logo=Amazon%20EC2&logoColor=white">
  <img src="https://img.shields.io/badge/Amazon%20S3-569A31?style=for-the-badge&logo=Amazon%20S3&logoColor=white">
</div>

### 프로젝트 관리

![Jira](https://img.shields.io/badge/jira-%230A0FFF.svg?style=for-the-badge&logo=jira&logoColor=white)
![Confluence](https://img.shields.io/badge/confluence-%23172BF4.svg?style=for-the-badge&logo=confluence&logoColor=white)

### 커뮤니티 및 소통

![Discord](https://img.shields.io/badge/Discord-%235865F2.svg?style=for-the-badge&logo=discord&logoColor=white)

## 전체 구성도
![인프라](https://github.com/user-attachments/assets/dcda51c7-2d7f-4d97-83cc-c58af091d8cd)


## ERD
![erd](https://github.com/user-attachments/assets/98fa64e3-89fa-4289-9a0a-48b709c1b04a)


## 설치 및 실행방법

- application.yml
```
Server:
  tomcat:
    max-http-form-post-size: 
jwt:
  secret:
spring:
  datasource:
    url: 
    username: 
    password: 
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: create # 운영 시, none으로 표기
    database: postgresql
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    open-in-view: true
#    show-sql: true
    generate-ddl: true
    properties:
      hibernate:
        default_batch_fetch_size: 100
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: 
            client-secret: 
            redirect-uri: 
            authorization-grant-type: authorization_code
            scope: profile, email

          kakao:
            client-id: 
#            redirect-uri: 
            redirect-uri: 
            client-authentication-method: client_secret_post
            authorization-grant-type: authorization_code
            scope: profile_nickname, account_email

        provider:
          kakao:
            authorization_uri: https://kauth.kakao.com/oauth/authorize
            token_uri: https://kauth.kakao.com/oauth/token
            user-info-uri: https://kapi.kakao.com/v2/user/me
            user_name_attribute: id
  aws:
    accessKeyId: 
    secretAccessKey: 
    region: 
    s3:
      bucketName: 
  data:
    redis:
      host: 
      port: 

logging.level:
  org.hibernate.SQL: debug
```
