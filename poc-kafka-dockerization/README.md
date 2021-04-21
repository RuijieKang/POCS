Bring up and down the producers and consumers in cluster/kafka

- docker-compose up -d
- docker-compose down

Manage the kafka cluster

- Kafka Manager console http://localhost:9000/

References
- https://www.vinsguru.com/category/kafka/
- https://docs.confluent.io/platform/current/quickstart/cos-docker-quickstart.html
- https://spring.io/projects/spring-kafka

Build the fat jar file
- mvn clean package

Build the docker image
- docker build -t donegall/producer-consumer .

Bring up and down the producers and consumers in cluster/demo
- docker-compose up -d
- docker-compose down
- docker-compose up --scale consumer=2