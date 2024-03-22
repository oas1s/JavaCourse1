package ru.itis.springaop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.springaop.entity.User;
import ru.itis.springaop.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createMockUsers() {
        User user = User.builder()
                .name("Azat")
                .surname("Faskhutdinov")
                .age(23).build();
        User user1 = User.builder()
                .name("Petya")
                .surname("Ivanov")
                .age(18).build();
        User user2 = User.builder()
                .name("Ivan")
                .surname("Petrov")
                .age(25).build();
        userRepository.save(user);
        userRepository.save(user1);
        userRepository.save(user2);
    }
}
