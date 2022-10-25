FROM openjdk:8-jdk-alpine
EXPOSE 8083
VOLUME /tmp
ADD /target/gateway-0.0.1-SNAPSHOT.jar gateway-service.jar
ENTRYPOINT ["java", "-jar", "gateway-service.jar"]
