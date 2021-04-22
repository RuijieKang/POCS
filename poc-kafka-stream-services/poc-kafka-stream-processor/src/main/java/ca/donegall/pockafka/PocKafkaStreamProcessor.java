package ca.donegall.pockafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocKafkaStreamProcessor {
	public static void main(String[] args) {
		SpringApplication.run(PocKafkaStreamProcessor.class, args);
	}
}
