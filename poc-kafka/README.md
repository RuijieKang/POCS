Bring up and down the kafka environment

- docker-compose up -d
- docker-compose down

Manage the kafka cluster

- Kafka Manager console http://localhost:9000/

Create topics used by the application
- random-number

Terms:
    Topics : logical table / event stream
    Partition: A segment of data in topics supporting redundency and parallism
    Boker: physical node
    Consumer group: dynamic grouping of consumers to support redundency and parallism
    
References
- https://www.vinsguru.com/category/kafka/
- https://docs.confluent.io/platform/current/quickstart/cos-docker-quickstart.html
- https://spring.io/projects/spring-kafka
