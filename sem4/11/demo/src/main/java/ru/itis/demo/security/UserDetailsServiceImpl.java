package ru.itis.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.itis.demo.entity.User;
import ru.itis.demo.repository.UsersRepository;

import java.util.Optional;

@Component(value = "customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = usersRepository.findOneByEmail(email);

        if (userOptional.isPresent()) {
            return new UserDetailsImpl(userOptional.get());
        } else throw new SecurityException("User with email <" + email + "> not found");
    }
}