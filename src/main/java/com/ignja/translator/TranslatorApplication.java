package com.ignja.translator;

import javax.ws.rs.ApplicationPath;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TranslatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new TranslatorApplication().configure(new SpringApplicationBuilder(TranslatorApplication.class)).run(args);
		//SpringApplication.run(TranslatorApplication.class, args);
	}

}
