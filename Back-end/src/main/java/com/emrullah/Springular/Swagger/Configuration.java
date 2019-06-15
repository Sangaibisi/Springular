package com.emrullah.Springular.Swagger;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@org.springframework.context.annotation.Configuration
@EnableSwagger2
public class Configuration {
	
		private static final String SWAGGER_API_VERSION = "1.0";
	    private static final String LICENSE_TEXT = "License. This is a open source project for who wants to learn how to develop full-stack api.";
	    private static final String title = "Springular Rest API";
	    private static final String description = "RESTful API Documentation for Springular";
	    
	@Bean
	public Docket configApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.emrullah.Springular"))
				.paths(PathSelectors.regex("/customers.*"))
				.build();
	}
	
	private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title(title)
	                .description(description)
	                .license(LICENSE_TEXT)
	                .version(SWAGGER_API_VERSION)
	                .build();
	}

}
