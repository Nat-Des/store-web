package com.saracks.storeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@ComponentScan(basePackages = "com.saracks.")
@EntityScan("com.saracks.")
@EnableJpaRepositories(basePackages = "com.saracks.repositories")
public class StoreWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreWebApplication.class, args);
	}

}
