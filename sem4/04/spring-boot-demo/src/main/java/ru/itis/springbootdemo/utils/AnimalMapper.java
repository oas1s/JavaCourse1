package ru.itis.springbootdemo.utils;

import ru.itis.springbootdemo.dto.AnimalDto;
import ru.itis.springbootdemo.entity.Animal;

public class AnimalMapper {

     public static Animal fromDto(AnimalDto animalDto){
        return Animal.builder()
                .age(animalDto.getAge())
                .breed(animalDto.getBreed())
                .weight(animalDto.getWeight())
                .name(animalDto.getAnimalName())
                .build();
    }

    public static AnimalDto fromEntity(Animal animal){
         return AnimalDto.builder()
                 .animalName(animal.getName())
                 .weight(animal.getWeight())
                 .breed(animal.getBreed())
                 .age(animal.getAge())
                 .build();
    }

}
