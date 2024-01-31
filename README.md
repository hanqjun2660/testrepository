
## Jenkins / Docker 배포 테스트
 - 클라우드 서버X, Ubuntu Desktop GUI

## 환경
 - Ubuntu 20.04.6 LTS
 - Jenkins 2.426.2
 - Docker 24.0.7
 - Docker Compose 2.24.0
 - Nginx Proxy Manager 2.11.1

## 진행사항
1. Git Webhook -> jenkins
2. Jenkins -> Gradle Build
3. Docker image -> Docker container

**특이사항**
1. Jenkins 외부접속 가능
2. ssh 외부접속 가능
3. DB 외부접속 가능
4. Application 외부접속 가능 (test.devsj.site/test (Get 요청 가능)) 