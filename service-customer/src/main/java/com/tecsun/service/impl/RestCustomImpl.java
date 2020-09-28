package com.tecsun.service.impl;

import com.tecsun.service.RestService;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjw
 * @create 2020/9/19 17:33
 **/
@Service
public class RestCustomImpl implements RestService {
	//    restTemplate 模板
	private  final RestTemplate restTemplate= RestTemplateBuilder.create();
	@Override
	public String sayRest(String name) {
		String providename="provider";
		return restTemplate.getForObject("cse://" + providename +"/hello/hello", String.class);
	}
}
