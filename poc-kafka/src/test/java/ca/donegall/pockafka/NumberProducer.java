package ca.donegall.pockafka;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.springframework.retry.support.RetrySimulation.SleepSequence;
public class NumberProducer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public NumberProducer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            generateNumbers();
        } catch (InterruptedException e) {
            Thread.currentThread()
                .interrupt();
        }
        
    }

    private void generateNumbers() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Integer number = ThreadLocalRandom.current().nextInt(100);
            System.out.println(Thread.currentThread().getName() + "Producing number" + number.toString());
            queue.put(number);
            TimeUnit.SECONDS.sleep(1);               
        }
    }    
}
