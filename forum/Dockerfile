FROM openjdk:8-jdk-alpine
EXPOSE 8085
ADD /target/forum-0.0.1-SNAPSHOT.jar forum-service.jar
ENTRYPOINT ["java", "-jar", "forum-service.jar"]
