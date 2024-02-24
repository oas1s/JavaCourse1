package ru.itis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private Animal animal;

    @GetMapping("/hello")
    public String printHello(ModelMap model){
        model.addAttribute("message", animal.makeSound());
        return "hello";
    }
}
