package com.ignja.translator;

import javax.ws.rs.ApplicationPath;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories
@EnableJpaAuditing
public class TranslatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new TranslatorApplication().configure(new SpringApplicationBuilder(TranslatorApplication.class)).run(args);
		System.out.println("App started...");
	}

}
