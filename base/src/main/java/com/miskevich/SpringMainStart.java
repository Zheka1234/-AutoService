package com.miskevich;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.miskevich")
public class SpringMainStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringMainStart.class, args);

    }



}