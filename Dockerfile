FROM amazoncorreto:11-alpine-jdk // de que imagen Java partimos
MAINTAINER BCS // quien es el dueño? 
COPY target/bcs-2.7.2.jar  bcs-app.jar      // va a copiar el empaquetado de github
ENTRYPOINT ["java","-jar","/bcs-app.jar"]      // es la instruccion que se va a ejecutar primero
