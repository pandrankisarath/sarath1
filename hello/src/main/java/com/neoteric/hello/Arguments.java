package com.neoteric.hello;

import org.springframework.boot.SpringApplication;

public class Arguments {

    public static void main(String[] args) {

        System.out.println(System.getProperty("sarath"));
        SpringApplication.run(HelloApplication.class, args);
    }

}
