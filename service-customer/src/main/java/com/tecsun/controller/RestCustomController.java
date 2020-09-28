package com.tecsun.controller;

import com.tecsun.service.RestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjw
 * @create 2020/9/19 17:48
 **/
@RestSchema(schemaId ="test")
@RequestMapping("/test")
public class RestCustomController {
	@Autowired
	private RestService restService;

	@GetMapping("/test")
	public String sayRest(String name) {
		return restService.sayRest(name);
	}
}