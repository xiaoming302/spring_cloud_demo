FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD server-config-1.0.0-SNAPSHOP.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]