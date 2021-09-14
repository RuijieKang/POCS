package ca.donegall.pockafka;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

public class ReactiveStreamTest {
    @Test
    public void testReactiveStream(){
        Flux<Long> producer = Flux.interval(Duration.ofSeconds(1)).take(4).log();
        
        Flux<Long> processed = producer.publishOn(Schedulers.parallel())
            .map(number -> number * number)
            .doOnNext(number ->{System.out.println("Current thread for  " + number + " " + Thread.currentThread().getName());})
            .log();

        StepVerifier.create(processed)
            .expectNext(0L)
            .expectNext(1L)
            .expectNext(4L)
            .expectNext(9L)
            .expectComplete()
            .verify();
    }    
}
