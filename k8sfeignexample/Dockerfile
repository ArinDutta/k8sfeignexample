FROM openjdk:8-jdk-alpine
EXPOSE 8088
ARG JAR_FILE=target/k8sfeignexample-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} k8feign.jar
ENTRYPOINT ["java","-jar","/k8feign.jar"]