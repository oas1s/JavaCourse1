package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.AnimalDto;

import java.util.List;

public interface AnimalService {
    void createAnimal(AnimalDto animalDto);

    List<AnimalDto> getAllAnimals();
}
