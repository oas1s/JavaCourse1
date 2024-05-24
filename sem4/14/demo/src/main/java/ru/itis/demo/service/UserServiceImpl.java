package ru.itis.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.demo.entity.User;
import ru.itis.demo.repository.UsersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Override
    public void banAll() {
        List<User> users = usersRepository.findAll();
        users.forEach(u ->{
            if (!u.isAdmin()) u.setState(User.State.BANNED);
        });
        usersRepository.saveAll(users);
    }
}
