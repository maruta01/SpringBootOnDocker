package com.SpringBootOnDocker.springbootondockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootOnDocker.springbootondockerexample.dto.HelloDto;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	public HelloDto Hello(){
		HelloDto helloDto = new HelloDto();
		helloDto.setMessage("hello maruta01");
		return helloDto;
	}

}
