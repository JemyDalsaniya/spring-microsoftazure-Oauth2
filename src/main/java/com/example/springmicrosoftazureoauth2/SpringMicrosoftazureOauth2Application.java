package com.example.springmicrosoftazureoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class SpringMicrosoftazureOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicrosoftazureOauth2Application.class, args);
	}

}
