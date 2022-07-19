## Dockerfile-prod
FROM openjdk:11-jdk-slim
EXPOSE 8088
ARG JAR_FILE=/build/libs/Web-Team-2-Backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/app.jar"]