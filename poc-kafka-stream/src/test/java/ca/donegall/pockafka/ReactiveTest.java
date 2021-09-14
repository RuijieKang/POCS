package ca.donegall.pockafka;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ReactiveTest {
    @Test
    public void testReactiveStream(){
        Flux<Long> producer = Flux.interval(Duration.ofSeconds(1)).take(4).log();
        
        Flux<Long> processed = producer.map(number -> number * number).log();

        StepVerifier.create(processed)
            .expectNext(0L)
            .expectNext(1L)
            .expectNext(4L)
            .expectNext(9L)
            .expectComplete()
            .verify();
    }    
}
