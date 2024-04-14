package io.github.meloncode.cardsserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CardsServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsServiceApiApplication.class, args);
	}

}
