FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

COPY Construction-Tracker-App-BackEnd/pom.xml /app
COPY Construction-Tracker-App-BackEnd/src /app/src

RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]