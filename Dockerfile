FROM openjdk:8-jre-alpine

COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8090

CMD ["/usr/bin/java", "-jar", "/app.jar"]
