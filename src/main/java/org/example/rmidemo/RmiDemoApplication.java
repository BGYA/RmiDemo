package org.example.rmidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RmiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmiDemoApplication.class, args);
		RmiServerInitializer.init();

	}

}
