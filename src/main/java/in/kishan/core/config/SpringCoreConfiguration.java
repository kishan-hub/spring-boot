package in.kishan.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringCoreConfiguration {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				 .info(new Info() 
						 .title("Product API")
						 .version("1.0")
						 .description("API for managing products")
						  .termsOfService("http://swagger.io/terms/")
				          .license(new License().name("Apache 2.0").url("http://springdoc.org")));
		
	}
	
	
}
