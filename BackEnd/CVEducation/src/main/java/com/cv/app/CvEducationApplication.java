package com.cv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication

public class CvEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvEducationApplication.class, args);
	}

}
