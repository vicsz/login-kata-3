package com.kata.loginapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    //required to run SpringBoot App as traditional War instead of Jar
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    //Standard Entry Point for SpringBootApplication
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
