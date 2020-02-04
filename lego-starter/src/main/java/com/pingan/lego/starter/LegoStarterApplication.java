package com.pingan.lego.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pingan.lego")
public class LegoStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegoStarterApplication.class, args);
    }

}
