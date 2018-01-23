package com.pcf.spring.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
}

@RestController
class MessageRestController {
	
	@RequestMapping("/hello")
	String getMessage(@RequestParam(value="name") String name){
		String rsp="HI"+name+"respsoned on";
		System.out.println(rsp);
		return rsp;
	}
	
}
