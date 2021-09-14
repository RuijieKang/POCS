package ca.donegall.pockafka;

import java.util.concurrent.BlockingQueue;
public class NumberConsumer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public NumberConsumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer number = queue.take();
                System.out.println(Thread.currentThread().getName() + " Comsuming number : " + number.toString());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }        
    }
    
}
