package ru.itis.springdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.springdatajpaexample.entity.Pet;
import ru.itis.springdatajpaexample.entity.Toy;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet,Long> {

    List<Pet> findAllByToysContains(Toy toy);

    @Query("SELECT pet FROM Pet pet inner join Toy toy" +
            "where toy.id =:toyId")
    List<Pet> findAllBy(@Param("toyId") Long toyId);

    @Query(nativeQuery = false, value = "" +
            "SELECT * FROM pet where user_id =:userId")
    List<Pet> findAllByUserId(Long userId);

    List<Pet> findAllByUser_Id(Long userId);
}
