package com.techinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// to test application
// http://localhost:8091/swagger-ui.html
// http://localhost:8091/swagger-ui/index.html


// for Swagger api documentation generation
// http://localhost:8091/v2/api-docs
// http://localhost:8091/v3/api-docs

@SpringBootApplication
public class SwaggerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerIntegrationApplication.class, args);
	}

}
