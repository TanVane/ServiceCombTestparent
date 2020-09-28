package com.tecsun.service.impl;

import com.tecsun.service.RestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjw
 * @create 2020/9/19 17:10
 **/
@RestSchema(schemaId ="hello")// 注册微服务到注册中心
@RequestMapping("/hello")
public class RestServiceImpl implements RestService {
	@Override
	@GetMapping("hello")
	public String sayRest(String name) {
		return "hello world"+name;
	}
}
