FROM amazoncorretto:11-alpine-jdk
MAINTAINER BCS 
COPY target/bcs-2.7.2.jar  bcs-app.jar      
ENTRYPOINT ["java","-jar","/bcs-app.jar"]
EXPOSE 8080 
