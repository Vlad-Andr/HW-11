FROM alpine

RUN apk add --no-cashe \
    openjdk11 \
    maven \
    curl

VOLUME /home/hwapp
WORKDIR /home/hwapp
COPY ./ /home/hwapp

ARG JAR_FILE=target/hw11-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} proj.jar

EXPOSE 8090

CMD java -jar proj.jar