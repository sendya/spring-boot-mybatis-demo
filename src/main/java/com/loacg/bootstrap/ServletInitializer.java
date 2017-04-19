package com.loacg.bootstrap;

import com.loacg.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ServletInitializer extends SpringBootServletInitializer {

	static {
		// output color fix
		System.setProperty("spring.output.ansi.enabled", "ALWAYS");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
