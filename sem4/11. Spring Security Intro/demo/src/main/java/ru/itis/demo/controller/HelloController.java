package ru.itis.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.demo.entity.User;
import ru.itis.demo.security.UserDetailsImpl;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getHello(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        User user = userDetails.getUser();
        System.out.println(user);
        return "Hello";
    }
}