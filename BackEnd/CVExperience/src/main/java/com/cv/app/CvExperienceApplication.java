package com.cv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class CvExperienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvExperienceApplication.class, args);
	}

}
