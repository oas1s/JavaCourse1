package ru.itis.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    @PreAuthorize("permitAll()")
    public String getRoot(){
        return "Hello!";
    }

    @GetMapping("/secured")
    @PreAuthorize("isAuthenticated()")
    public String securedPage(@AuthenticationPrincipal OAuth2User principal){
        System.out.println(principal);
        return "Secured!";
    }

}
