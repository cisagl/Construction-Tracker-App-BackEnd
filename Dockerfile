FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

# Sadece pom.xml dosyasını kopyalayarak bağımlılıkları indirmek için
COPY pom.xml /app/pom.xml
RUN mvn dependency:go-offline -B

# Uygulama kaynak kodlarını kopyalayarak derleme işlemi
COPY src /app/src
RUN mvn clean package -DskipTests

FROM openjdk:17

WORKDIR /app

# Hedef dizinindeki .jar dosyasını kopyala
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
