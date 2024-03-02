package ru.itis.springbootdemo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.AnimalDto;
import ru.itis.springbootdemo.entity.Animal;
import ru.itis.springbootdemo.repository.AnimalRepository;
import ru.itis.springbootdemo.utils.AnimalMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Override
    public void createAnimal(AnimalDto animalDto) {
        Animal animal = AnimalMapper.fromDto(animalDto);
        animalRepository.save(animal);
    }

    @Override
    public List<AnimalDto> getAllAnimals() {
        List<Animal> animals = animalRepository.findAll();
        return animals.stream().map(AnimalMapper::fromEntity).toList();
    }
}
