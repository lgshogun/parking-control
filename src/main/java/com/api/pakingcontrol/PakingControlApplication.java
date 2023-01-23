package com.api.pakingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class PakingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakingControlApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Ola Mundo";
	}
}
