package com.pramod.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages= {"com.pramod.user"})
public class SpringWithMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMongoDbApplication.class, args);
	}

}
