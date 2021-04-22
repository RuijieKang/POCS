package ca.donegall.pockafka.producer;

import java.time.Duration;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class ProducerConfiguration {
	@Bean
    public Supplier<Flux<Long>> numberProducer(){
        return () -> Flux.range(1, 1000)
                        .map(Long::valueOf)
                        .delayElements(Duration.ofSeconds(1))
						.log();
    }
}
