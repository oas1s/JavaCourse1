package ru.itis.springdatajpaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.springdatajpaexample.dto.PetDto;
import ru.itis.springdatajpaexample.entity.Toy;
import ru.itis.springdatajpaexample.repository.PetRepository;
import ru.itis.springdatajpaexample.repository.ToyRepository;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private ToyRepository toyRepository;

    @GetMapping("/pets/findByToy")
    public List<PetDto> getPets(@RequestParam(name = "toy_id") Long toyId){
        Toy toy = toyRepository.findById(toyId).get();
        return petRepository.findAllByToysContains(toy).stream()
                .map(PetDto::fromEntity).toList();
    }
}
