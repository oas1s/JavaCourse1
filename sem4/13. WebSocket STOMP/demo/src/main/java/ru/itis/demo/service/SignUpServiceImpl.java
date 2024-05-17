package ru.itis.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.demo.entity.User;
import ru.itis.demo.form.SignUpForm;
import ru.itis.demo.repository.UsersRepository;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .passwordHash(passwordEncoder.encode(form.getPassword()))
                .email(form.getEmail())
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .role(User.Role.USER)
                .state(User.State.ACTIVE)
                .build();

        usersRepository.save(user);
    }
}