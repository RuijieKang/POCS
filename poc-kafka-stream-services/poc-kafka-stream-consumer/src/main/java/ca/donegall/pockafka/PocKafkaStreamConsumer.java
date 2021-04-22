package ca.donegall.pockafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocKafkaStreamConsumer {
	public static void main(String[] args) {
		SpringApplication.run(PocKafkaStreamConsumer.class, args);
	}
}
