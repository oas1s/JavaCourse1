package ru.itis.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootdemo.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
