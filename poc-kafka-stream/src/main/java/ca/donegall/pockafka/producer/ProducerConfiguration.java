package ca.donegall.pockafka.producer;

import java.time.Duration;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class ProducerConfiguration {
    @Bean
	public Supplier<Flux<Long>> producer(){
		return () -> Flux.interval(Duration.ofSeconds(1))
							.log();
	}    
}
