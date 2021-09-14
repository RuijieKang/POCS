package ca.donegall.pockafka;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class NumberQueueTest {

    @Test
    public void testProducerConsumerOneOnOne() throws InterruptedException{
        int bound = 10;
        
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(bound);

        Thread producer = new Thread(new NumberProducer(queue));

        Thread consumer = new Thread(new NumberConsumer(queue));

        producer.start();
        consumer.start();  

        consumer.join();
        producer.join();
    }   
    
    @Test
    public void testProducerConsumerManyOnMany() throws InterruptedException{
        int bound = 10;        
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(bound);


        List<Thread> tasks = new LinkedList<Thread>();
        int numberOfProducers = 3;
        for(int i = 0; i < numberOfProducers; i++){
            Thread producer = new Thread(new NumberProducer(queue));
            producer.start();
            tasks.add(producer);

        }


        int numberOfConsumers = 2;
        for(int i = 0; i < numberOfConsumers; i++){
            Thread consumer = new Thread(new NumberConsumer(queue));
            consumer.start();
            tasks.add(consumer);
        }

        tasks.forEach(task -> {
            try {
                task.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }   
}
