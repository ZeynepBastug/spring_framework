package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    // Direct Wiring
    @Bean
    @Primary
    Person person(){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());
        return p;
    }

    // AutoWiring
    @Bean
    Person person2(Car car){
        Person p = new Person();
        p.setName("Mike2");
        p.setCar(car);
        return p;
    }
}
