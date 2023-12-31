# 삐융 백엔드

![삐융 대문 사진](./ppiyung_logo.png)

2022-2023 한국소프트웨어산업협회 솔트룩스 채용연계 교육과정  
1차 팀프로젝트 2조 삐융

삐융은 가상의 IT 채용 플랫폼입니다. 사용자는 구직회원과 일반회원으로 나뉘어 가입되며, 채용 공고를 게시하고/게시된 채용 공고에 지원할 수 있습니다.

## 테스트 인스트럭션

### 요구 사항
- JDK 1.8
- Tomcat 9.x
- MySQL 8.x
- STS 3.x (아래의 인스트럭션을 따르는 경우)

### 기본 SQL 스크립트 실행
```sh
$ mysql -u유저 -p비밀번호

mysql> source ./ppiyung_base_0.5.2.sql

# 오류가 없는 것을 확인

mysql> exit
```

### STS 임포트 및 설정 수정
- Git Perspective에서 ppiyung-backend/ppiyung/를 프로젝트로 임포트
- 'src/main/resources/config' 디렉토리 내의 *.properties 수정 (DB 접속 정보 등)
- src/main/webapp/WEB-INF/spring/security-context.xml에서 CORS 허용 Origin과 JWT 서명 키를 지정
- 톰캣에 프로젝트를 추가하고 실행

### 프론트엔드 세팅
[프론트엔드 저장소](https://github.com/ppiyung/ppiyung-frontend) 참고