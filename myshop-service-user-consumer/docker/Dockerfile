FROM openjdk:8-jre

MAINTAINER Ruanjiayu <1005572910@qq.com>

ENV APP_VERSION 1.0.0-SNAPSHOT
ENV DOCKERIZE_VERSION v0.6.1

RUN wget http://192.168.10.11/Uncle/dockerize-linux/raw/master/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz


RUN mkdir /app

COPY myshop-service-user-consumer-$APP_VERSION.jar /app/app.jar

ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "tcp://192.168.10.16:20881", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]

EXPOSE 8601 8701