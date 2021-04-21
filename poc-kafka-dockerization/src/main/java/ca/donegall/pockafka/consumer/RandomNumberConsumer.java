package ca.donegall.pockafka.consumer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Profile("consumer")
@Component
public class RandomNumberConsumer {
    private static Logger logger = LoggerFactory.getLogger(RandomNumberConsumer.class); 

    @Value("${consumer.processing.time}")
    private long processingTime;

    @KafkaListener(topics = "random-number")
    public void consume(String message) throws UnknownHostException, InterruptedException{
        String hostName = InetAddress.getLocalHost().getHostName();
        logger.info("Host {} consuming number {}", hostName, message);
        TimeUnit.SECONDS.sleep(processingTime);
    }    
}
