package ru.itis.springdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springdatajpaexample.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
