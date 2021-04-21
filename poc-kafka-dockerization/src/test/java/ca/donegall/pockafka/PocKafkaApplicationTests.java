package ca.donegall.pockafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"producer","consumer"})
@SpringBootTest
class PocKafkaApplicationTests {

	@Test
	void contextLoads() {
	}

}
