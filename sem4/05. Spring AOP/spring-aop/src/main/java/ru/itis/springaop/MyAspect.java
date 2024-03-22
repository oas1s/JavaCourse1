package ru.itis.springaop;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.itis.springaop.entity.User;
import ru.itis.springaop.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Component
@Aspect
@RequiredArgsConstructor
public class MyAspect {

    private final UserRepository userRepository;

    @SneakyThrows
    @Around(value =
            "execution(public * ru.itis.springaop.services.UserServiceImpl.createMockUsers())")
    public void beforeSomeMethods(ProceedingJoinPoint pjp){
        User user = User.builder()
                .name("Name From aspect")
                .surname("Surname")
                .age(100).build();
        userRepository.save(user);
    }
}
