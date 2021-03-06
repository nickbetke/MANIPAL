package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TelephoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelephoneApplication.class, args);
	}

}
