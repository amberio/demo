package com.example.demo;

import org.apache.kafka.streams.integration.utils.EmbeddedKafkaCluster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void failingTest() throws IOException, InterruptedException {
		EmbeddedKafkaCluster embeddedKafkaCluster = new EmbeddedKafkaCluster(1);
		embeddedKafkaCluster.start();
	}
}
