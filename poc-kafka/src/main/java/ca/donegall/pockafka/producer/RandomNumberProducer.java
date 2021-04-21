package ca.donegall.pockafka.producer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberProducer {
    private static Logger logger = LoggerFactory.getLogger(RandomNumberProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public RandomNumberProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 1000)
    public void produce() throws UnknownHostException{
        String randomString = String.valueOf(ThreadLocalRandom.current().nextInt(1000,9999));
        this.kafkaTemplate.sendDefault(randomString);

        String hostName = InetAddress.getLocalHost().getHostName();
        logger.info("Host {} producing number {}", hostName, randomString);
    }   
}
