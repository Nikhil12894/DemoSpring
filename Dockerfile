FROM openjdk:14-jdk-alpine
EXPOSE 8080
ADD target/bootdemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]