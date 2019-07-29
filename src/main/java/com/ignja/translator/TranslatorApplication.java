package com.ignja.translator;

import javax.ws.rs.ApplicationPath;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TranslatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new TranslatorApplication().configure(new SpringApplicationBuilder(TranslatorApplication.class)).run(args);
		System.out.println("App started...");
	}

}
