package ru.itis.demo.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.demo.form.SignInForm;
import ru.itis.demo.security.JwtUtils;

import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
public class SignInController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtils jwtUtils;


    @GetMapping("/signIn")
    @PreAuthorize("permitAll()")
    public String getSignInPage(HttpServletRequest request, ModelMap model) {
        if (request.getParameterMap().containsKey("error")) {
            model.addAttribute("error", "error");
        }
        return "sign_in";
    }

    @PostMapping("/signIn")
    @PreAuthorize("permitAll()")
    public String signIn(SignInForm signInForm, HttpServletResponse response){
            authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(signInForm.getEmail(), signInForm.getPassword(),
                            new ArrayList<>()));
            final UserDetails user = userDetailsService.loadUserByUsername(signInForm.getEmail());
            if (user != null) {
                String jwt = jwtUtils.generateToken(user);
                Cookie cookie = new Cookie("jwt", jwt);
                cookie.setMaxAge(7 * 24 * 60 * 60); // expires in 7 days
                cookie.setHttpOnly(true);
                cookie.setPath("/"); // Global
                response.addCookie(cookie);
                return "redirect:/hello";
            }
            throw new RuntimeException("User not found");
    }
}