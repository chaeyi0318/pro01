package com.example.pro01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
@PropertySource(value = "application.properties")
public class Pro01Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro01Application.class, args);
	}

}
