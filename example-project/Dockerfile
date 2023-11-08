FROM openjdk:17

CMD ["gradle" , "bootJar"]

ARG JAR_FILE_PATH=build/libs/example-project-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE_PATH} app.jar

ENTRYPOINT ["java" , "-jar" , "app.jar" , "1> /dev/null 2>&1 &"]


