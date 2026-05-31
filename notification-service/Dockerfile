FROM eclipse-temurin:21-jre-jammy

WORKDIR /workspace/app

COPY target/notification-service-1.0.0.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","app.jar"]


