package com.example.EmployeeEurekaServer;


import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableEurekaServer
@SpringBootApplication
public class EmployeeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeEurekaServerApplication.class, args);
	}

}
