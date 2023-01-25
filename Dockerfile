FROM adoptopenjdk/openjdk11
ARG JAR_FILE=chat.jar
COPY ${JAR_FILE} chat.jar
ENTRYPOINT ["java", "-jar","chat.jar"]
