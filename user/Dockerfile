FROM openjdk:17-jdk-alpine
LABEL authors="ArtGane"
VOLUME /tmp
ARG JAR_FILE=target/user-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]