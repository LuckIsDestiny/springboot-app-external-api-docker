FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/posts.jar posts.jar
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "posts.jar"]