package com.example.ms_inventario_db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                   .info(new Info().title("API de inventario (ms-inventario-db) - Perfulandia")
                                    .description("Microservicio que se encarga del acceso y gestión a la base de datos")
                                    .version("1.0.0"));
    }
    

}
