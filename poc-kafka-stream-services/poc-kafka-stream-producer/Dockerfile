FROM openjdk:11.0.7-jre-slim

WORKDIR /usr/app

ADD target/poc-kafka*.jar app.jar

# Expect ${BROKER1} and ${BROKER2}
ENTRYPOINT java -jar app.jar