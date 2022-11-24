FROM openjdk:17-alpine
EXPOSE 8080
ADD ./target/spring-boot-on-docker-example-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]