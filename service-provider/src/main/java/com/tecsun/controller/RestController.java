package com.tecsun.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjw
 * @create 2020/9/19 17:10
 **/
@RestSchema(schemaId ="helloOut")// 注册微服务到注册中心
@RequestMapping("/provider/out")
@Controller
public class RestController {
	@GetMapping("/hello")
	public String sayRest(String name) {
		return "hello world"+name;
	}

	@GetMapping("/login")
	public String login(String name) {
		return "登录===="+name;
	}
}
