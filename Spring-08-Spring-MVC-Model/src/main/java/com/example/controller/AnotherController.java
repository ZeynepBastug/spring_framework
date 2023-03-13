package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/another")
public class AnotherController {
    @RequestMapping("/list")
    public String anotherList(){
        return "";
    }
}
