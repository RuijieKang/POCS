package ca.donegall.pockafka.consumer;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberConsumer {
    private static Logger logger = LoggerFactory.getLogger(RandomNumberConsumer.class); 

    @KafkaListener(topics = "random-number")
    public void consume(String message) throws UnknownHostException{
        String hostName = InetAddress.getLocalHost().getHostName();
        logger.info("Host {} consuming number {}", hostName, message);
    }    
}
