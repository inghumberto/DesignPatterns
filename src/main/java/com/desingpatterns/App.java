package com.desingpatterns;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.desingpatterns.*"})
@EnableAutoConfiguration
public class App {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
