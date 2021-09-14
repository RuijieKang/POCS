FROM adoptopenjdk/openjdk11:latest

COPY target/*.jar ./producer-consumer.jar

EXPOSE 8000

# ENTRYPOINT java -jar producer-consumer.jar \
#                     --spring.profiles.active=$PROFILE \
#                     --spring.kafka.bootstrap-servers=$BROKER \
#                     --comsumer.processing.time=$MESSAGE_PROCESSING_TIME