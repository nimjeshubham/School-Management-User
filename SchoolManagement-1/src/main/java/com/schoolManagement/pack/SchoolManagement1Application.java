package com.schoolManagement.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SchoolManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagement1Application.class, args);
	}

}
