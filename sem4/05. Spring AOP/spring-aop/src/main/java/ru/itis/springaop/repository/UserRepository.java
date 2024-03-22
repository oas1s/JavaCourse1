package ru.itis.springaop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springaop.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
