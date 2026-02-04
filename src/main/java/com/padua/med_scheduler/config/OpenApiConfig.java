package com.padua.med_scheduler.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Med Scheduler - API de Agendamento Médico")
                        .description("API REST para gerenciamento de médicos, pacientes e consultas")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Carlos Padua")
                                .email("carlospadua2311@gmail.com"))
                        .license(new License()
                                .name("MIT")));
    }
}
