FROM openjdk:23-ea-17-slim-bullseye
LABEL authors="riaz.farhanian@gmail.com"

WORKDIR /app

COPY target/*.jar /app/

ENTRYPOINT ["java", "-jar" , "k-test-1.0.0.jar"]