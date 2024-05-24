package ru.itis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.demo.form.SignUpForm;
import ru.itis.demo.service.SignUpService;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    @PreAuthorize("permitAll()")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    @PreAuthorize("permitAll()")
    public String signUpUser(SignUpForm signUpForm) {
        signUpService.signUp(signUpForm);
        return "redirect:/signIn";
    }
}