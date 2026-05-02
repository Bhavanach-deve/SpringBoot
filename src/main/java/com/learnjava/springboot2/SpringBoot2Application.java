package com.learnjava.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringBoot2Application.class, args);
        IGreetingService greet=container.getBean(IGreetingService.class);
        String status=greet.generateWish(" Bhavana");
        System.out.println(status);
    }
}
