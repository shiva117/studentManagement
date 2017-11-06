package com.corenttech.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.corenttech")
@EnableJpaRepositories("com.corenttech.repository")
@EntityScan("com.corenttech.model")
public class AgentApplication {
	public static void main(String[] args) {
		SpringApplication.run(AgentApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean<ServletContainer> jerseyServlet() {
		ServletRegistrationBean<ServletContainer> registration = new ServletRegistrationBean<>(new ServletContainer(),"/rest/*");
		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JersyConfig.class.getName());
		return registration;
	}
}
