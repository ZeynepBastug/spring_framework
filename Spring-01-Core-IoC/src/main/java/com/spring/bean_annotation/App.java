package com.spring.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
        FulltimeMentor ft = container.getBean(FulltimeMentor.class);
        ft.createAccount();


        ParttimeMentor pt = container.getBean("p1",ParttimeMentor.class);
        pt.createAccount();

        Developer dev = container.getBean(Developer.class);
        dev.createAccount();
    }
}
