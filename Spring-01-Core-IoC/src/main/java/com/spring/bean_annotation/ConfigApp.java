package com.spring.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    FulltimeMentor fullTimeMentor(){
        return new FulltimeMentor();
    }

    @Bean (name = "p1")
    ParttimeMentor partTimeMentor(){
        return new ParttimeMentor();
    }

    @Bean (name = "p2")
    ParttimeMentor partTimeMentor2(){
        return new ParttimeMentor();
    }
    @Bean
    @Primary
    Developer developer(){
        return new Developer();
    }
    @Bean
    Developer developer2(){
        return new Developer();
    }
}
