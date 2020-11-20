package com.trackit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.trackit.service", "com.trackit.dao", "com.trackit", "com.trackit.dto" })
public class TrackitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackitApplication.class, args);
	}

}
