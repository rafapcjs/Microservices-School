package com.microserive.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroseriveStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroseriveStudentApplication.class, args);
	}

}
