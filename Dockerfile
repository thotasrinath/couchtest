FROM eclipse-temurin:11
MAINTAINER dbs.com
RUN mkdir /opt/app
COPY target/couchtest-0.0.1-SNAPSHOT.jar /opt/app/couchtest-1.0.0.jar
ENTRYPOINT ["java","-jar","/opt/app/couchtest-1.0.0.jar"]