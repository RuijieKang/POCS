package ca.donegall.pockafka.consumer;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.streams.kstream.KStream;

@Configuration
public class ConsumerConfiguration {
    private static Logger logger = LoggerFactory.getLogger(ConsumerConfiguration.class); 

	@Bean
    public Consumer<KStream<String, Long>> squaredNumberConsumer(){
        return stream -> stream.foreach((key, value) -> logger.info("Square Number Consumed : {}" , value));
    }
}
