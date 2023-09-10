FROM amazoncorreto:18-alpine-jdk
MAINTAINER BCS 
COPY target/bcs-2.7.2.jar  bcs-app.jar      
ENTRYPOINT ["java","-jar","/bcs-app.jar"]    
