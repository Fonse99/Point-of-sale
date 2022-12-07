FROM mcr.microsoft.com/java/jdk:11-zulu-alpine

WORKDIR /app

COPY ./target/pos.jar /app

EXPOSE 8888

ENV MONGODB_URI=""

ENTRYPOINT ["java","-Dspring.data.mongodb.uri=${MONGODB_URI}", "-jar", "pos.jar"]
