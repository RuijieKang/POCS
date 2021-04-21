FROM adoptopenjdk/openjdk11:latest

ADD target/*.jar producer-consumer.jar

ENTRYPOINT java -jar producer-consumer.jar \
                    --spring.profiles.active=$PROFILE \
                    --spring.kafka.bootstrap-servers=$BROKER \
                    --comsumer.processing.time=$MESSAGE_PROCESSING_TIME