package ru.itis.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.springdemo.entity.Pet;
import ru.itis.springdemo.entity.Toy;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet,Long> {

    List<Pet> findAllByToysContains(Toy toy);

    @Query("SELECT pet FROM Pet pet inner join pet.toys toy where toy.id = :toyId")
    List<Pet> findAllByToyId(@Param("toyId") Long toyId);

    @Query(nativeQuery = true, value = "select * from pet where user_id =:userId")
    List<Pet> findAllByUserId(Long userId);

    List<Pet> findAllByUser_Id(Long userId);

    List<Pet> findAllByAgeBetweenAndNameEquals(Integer start,Integer end, String name);

}
