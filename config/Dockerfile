FROM openjdk:8-jdk-alpine
EXPOSE 8888
VOLUME /tmp
ADD /target/config-0.0.1-SNAPSHOT.jar config-service.jar
ENTRYPOINT ["java", "-jar", "config-service.jar"]
