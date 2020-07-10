package com.demo.cred_card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.demo.cred_card")
@EnableJpaRepositories("com.demo.cred_card.persistence.repo")
@EntityScan("com.demo.cred_card.persistence.model")
public class CredCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredCardApplication.class, args);
	}

}
