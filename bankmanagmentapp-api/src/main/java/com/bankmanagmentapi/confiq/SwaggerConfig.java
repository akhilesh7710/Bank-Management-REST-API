package com.bankmanagmentapi.confiq;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myCustomConfig() {
        return new OpenAPI()
                .info(
                		new Info()
                        .title("Bank APIs")
                        .description("by Akki")
                        ) 
                .servers(List.of(new Server().url("http://localhost:8080").description("local server")));
//        .tags(Arrays.asList(
//        		new Tag().name("account")
//        	//	new Tag().name("public Api's"), // 18.22   //23.19
// 
//        		));
    }
}
	
	


