package ru.itis.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/test")
    public String getPage(){
        return "sockets";
    }
}
