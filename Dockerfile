FROM eclipce-temurin:17-jdk
VOLUME /tmp
ARG JAR_FILE=build/libs/book-gradle-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Djava.security.edj=file:/dev/./urandom","/app.jar"]