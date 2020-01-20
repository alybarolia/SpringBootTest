package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class App{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        // System.out.println( "Hello World!" );
    }
}