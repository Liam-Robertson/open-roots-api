#File: Dockerfile
FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY build/libs/openroots-api.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
