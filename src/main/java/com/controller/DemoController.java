package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.GreetService;
import com.util.SpringUtil;

@Controller
public class DemoController {
	
@RequestMapping("hello")
public String hello(String c){
	GreetService greet=(GreetService) SpringUtil.getBeanByname("service");
	greet.f(c);
	return "index";
	
}
}
