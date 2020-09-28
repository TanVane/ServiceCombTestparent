package com.tecsun;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenjw
 * @create 2020/9/19 17:46
 **/
@SpringBootApplication
@EnableServiceComb
public class ConsumeApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class,args);
	}
}