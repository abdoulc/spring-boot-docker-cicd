FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD target/springboot-blog-image.jar springboot-blog-image.jar
ENTRYPOINT ["java","-jar","/springboot-blog-image.jar"]