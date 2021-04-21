package ca.donegall.pockafka.consumer;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfiguration {
    private static Logger logger = LoggerFactory.getLogger(ConsumerConfiguration.class); 

    @Bean
	public Consumer<Long> consumer(){
		return i -> logger.info("Consumer Received : {}" , i);
	}    
}
