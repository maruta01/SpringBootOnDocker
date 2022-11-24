# SpringBootOnDocker

How to try to start ?
- build docker image
  `docker build -t spring-boot-docker-example .`
- run docker
  `docker run -p 8088:8080 spring-boot-docker-example`
  
 Try GET API
 `http://localhost:8088/api/hello`
