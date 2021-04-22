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

Docerization
- mvn clean package
- docker build -t donegall/stream-producer .
docker run donegall/stream-producer \ 
--network poc-kafka-stream-services_default \
-e BROKER1=kafka1:9091 \
-e BROKER2=kafka2:9092 


References
- https://www.vinsguru.com/category/kafka/
- https://docs.confluent.io/platform/current/quickstart/cos-docker-quickstart.html
- https://spring.io/projects/spring-kafka

  
