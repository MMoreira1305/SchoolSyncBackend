package com.schoolsync.schoolsynchback.infra.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Cors Configuration, for the url permissions in this application and what methods
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**")
                .allowedOrigins("http://localhost:4200 adicionar o front da aplicação")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
    }
}