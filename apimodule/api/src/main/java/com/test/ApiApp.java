package com.test;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ApiApp {

	public static void main(String[] args) throws Exception {
		new SpringApplication(ApiApp.class).run(args);
	}

	@PostConstruct
	public void setUp() {
		log.info("Book for Api: {}", new Book(1L, "Book"));
	}

}
