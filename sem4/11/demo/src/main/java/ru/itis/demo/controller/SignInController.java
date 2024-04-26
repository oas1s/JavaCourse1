package ru.itis.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignInPage(HttpServletRequest request, ModelMap model) {
        if (request.getParameterMap().containsKey("error")) {
            model.addAttribute("error", "error");
        }
        return "sign_in";
    }
}