FROM openjdk:8-jdk-alpine
EXPOSE 8088
ADD /target/campagne-0.0.1-SNAPSHOT.jar campagne.jar
ENTRYPOINT ["java", "-jar", "campagne.jar"]