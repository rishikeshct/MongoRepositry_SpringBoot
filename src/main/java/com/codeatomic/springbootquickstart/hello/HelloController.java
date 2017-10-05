package com.codeatomic.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hellowWorld(){
		return "Hello World! Welcome to the SpringBoot MongoDB Course Application";
	}
}
