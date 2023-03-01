package com.spring_example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring_example.proxy","com.spring_example.service","com.spring_example.repository"})
public class ProjectConfig {
}
