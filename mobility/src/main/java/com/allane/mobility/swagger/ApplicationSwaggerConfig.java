package com.allane.mobility.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationSwaggerConfig {

    @Bean
    private static OpenAPI getApiInfo() {
        Contact contact = new Contact();
        contact.setName("Allane mobility group");
        return new OpenAPI()
                .info(new Info()
                        .title("Allane API")
                        .description("Leasing api documentation"));
    }

}
