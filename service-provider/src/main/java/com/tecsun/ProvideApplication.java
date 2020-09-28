package com.tecsun;

/**
 * @author chenjw
 * @create 2020/9/19 17:14
 **/

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb   //向注册中心注册
public class ProvideApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class,args);
	}
}
