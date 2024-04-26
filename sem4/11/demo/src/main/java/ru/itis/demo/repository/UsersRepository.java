package ru.itis.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.demo.entity.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}