FROM java:8
FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn clean install -DskipTests
EXPOSE 8080
LABEL maintainer="vovantrinhdhbkdn@gmail.com"
ADD target/AccountSystemManagement-0.0.1-SNAPSHOT.jar AccountSystemManagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","AccountSystemManagement-0.0.1-SNAPSHOT.jar"]