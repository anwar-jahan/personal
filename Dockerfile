FROM openjdk:16
WORKDIR /app
COPY ./build/libs/*.jar app/personal.jar
EXPOSE 8080
CMD exec java ${JAVA_USER_OPTS} -jar app/personal.jar