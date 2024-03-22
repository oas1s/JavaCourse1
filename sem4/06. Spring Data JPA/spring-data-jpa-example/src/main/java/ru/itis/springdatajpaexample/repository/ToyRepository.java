package ru.itis.springdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springdatajpaexample.entity.Toy;

public interface ToyRepository extends JpaRepository<Toy,Long> {
}
