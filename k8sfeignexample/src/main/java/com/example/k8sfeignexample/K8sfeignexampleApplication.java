package com.example.k8sfeignexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class K8sfeignexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sfeignexampleApplication.class, args);
	}

}
