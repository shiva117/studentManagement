package com.corenttech.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class JersyConfig extends ResourceConfig{

	public JersyConfig() {
		register(RequestContextFilter.class);
		packages("com.corenttech");
	}

}
