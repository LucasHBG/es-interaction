FROM openjdk:11
COPY ./target/es-interaction-0.0.1-SNAPSHOT.jar es-interaction-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "es-interaction-0.0.1-SNAPSHOT.jar"]