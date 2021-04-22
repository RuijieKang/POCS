package ca.donegall.pockafka.processor;

import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessorConfiguration {
    private static Logger logger = LoggerFactory.getLogger(ProcessorConfiguration.class); 
	
	@Bean
    public Function<KStream<String, Long>, KStream<String, Long>> evenNumberSquareProcessor(){
        return kStream ->  kStream
                            .filter((k, v) -> v % 2 == 0)
                            .peek((k, v) -> logger.info("Squaring Even : {}" , v))
                            .mapValues(v -> v * v);
    }
}
