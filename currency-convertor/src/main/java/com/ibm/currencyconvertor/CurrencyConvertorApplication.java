package com.ibm.currencyconvertor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author RavikumarPothannagar
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.ibm.currencyconvertor")

 @EnableSwagger2 

public class CurrencyConvertorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertorApplication.class, args);
	}

	
	
	  @Bean public Docket productApi() { return new
	  Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.
	  basePackage("com.ibm.currencyconvertor")).build(); }
	 
}
