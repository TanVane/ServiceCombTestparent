package com.tecsun.gateway;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class APIGetAwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGetAwayApplication.class, args);
	}
}
