package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DbConfig.class})
@ComponentScan(basePackages = {"com.example.demo.dao"})
public class AppConfig {

}
