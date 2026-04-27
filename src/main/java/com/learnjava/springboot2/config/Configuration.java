package com.learnjava.springboot2.config;

import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    public Configuration()
    {
        System.out.println("Config bean is created");
    }
@Bean
    public LocalTime createTime()
    {
        return LocalTime.now();

    }

}
