package ru.itis.springdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.springdatajpaexample.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT u FROM User u JOIN u.pets p JOIN p.toys t " +
            "WHERE p.name=:petName AND t.name=:toyName")
    List<User> getUsersWithPetAndToyName(@Param("petName") String petName,
                                         @Param("toyName") String toyName);

}
