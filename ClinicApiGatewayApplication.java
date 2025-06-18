package com.easysolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClinicApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicApiGatewayApplication.class, args);
	}
	@Bean
	RestClient.Builder restCientBuilder(){
		return RestClient.builder();
	}

}
