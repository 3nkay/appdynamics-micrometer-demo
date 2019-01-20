FROM openjdk:8u181-jre-slim-stretch

MAINTAINER n.kavtur@gmail.com

RUN chmod 600 /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management/jmxremote.password

WORKDIR /app

COPY target/*.jar .

COPY entrypoint.sh .

CMD ["/bin/sh","/app/entrypoint.sh"]
