package ru.itis.springaop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.springaop.entity.User;
import ru.itis.springaop.services.UserService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/createMockUsers")
    public String getPage(){
        service.createMockUsers();
        return "redirect:/users";
    }


    @GetMapping("/users")
    public String getUsersPage(ModelMap map){
        List<User> users = service.getAllUsers();
        map.addAttribute("users",users);
        return "users";
    }


}
