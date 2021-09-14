Spring Cloud Stream is a framework for creating message-driven Microservices and It provides a connectivity to the message brokers. Something like Spring Data, with abstraction, we can produce/process/consume data stream with any message broker (Kafka/RabbitMQ) without much configuration.  The producer/processor/consumer is simplified using Java 8’s functional interfaces.

Bring up and down the kafka environment

- docker-compose up -d
- docker-compose down

Manage the kafka cluster

- Kafka Manager console http://localhost:9000/

Create topics used by the application

- numbers 
- squares 
  
Start the application
- PocKafkaStreamApplication
      
References
- https://www.vinsguru.com/spring-cloud-stream-kafka-binder/
- https://www.vinsguru.com/category/kafka/
- https://docs.confluent.io/platform/current/quickstart/cos-docker-quickstart.html
- https://spring.io/projects/spring-kafka

  
