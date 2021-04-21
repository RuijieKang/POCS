package ca.donegall.pockafka.processor;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class ProcessorConfiguration {
    @Bean
	public Function<Flux<Long>, Flux<Long>> processor(){
		return longFlux -> longFlux
				.map(i -> i * i)
				.log();
	}    
}
