package com.sha.microservicecoursemanagemet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroserviceCourseManagemetApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCourseManagemetApplication.class, args);
    }
    //Allowing origins for cross origin Resource sharing - WebMVC Configure
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**").allowedOrigins("*");
            }
        };

    }

}
