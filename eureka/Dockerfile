FROM openjdk:8-jdk-alpine
EXPOSE 8761
ADD /target/eureka-0.0.1-SNAPSHOT.jar eureka-service.jar
ENTRYPOINT ["java", "-jar", "eureka-service.jar"]
