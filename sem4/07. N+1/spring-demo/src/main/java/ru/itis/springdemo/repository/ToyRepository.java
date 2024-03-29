package ru.itis.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springdemo.entity.Toy;

public interface ToyRepository extends JpaRepository<Toy,Long> {
}
