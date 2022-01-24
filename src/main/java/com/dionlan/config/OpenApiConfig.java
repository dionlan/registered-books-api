package com.dionlan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
		        .info(new Info()
		                .title("RESTful API With Java 16 and Spring Boot 2.6")
		                .version("v1")
		                .description("Some description about your API.")
		                .termsOfService("https://pub.dionlan.com.br/meus-cursos")
		                .license(new License().name("Apache 2.0").url("https://pub.dionlan.com.br/meus-cursos")));
	}
}
