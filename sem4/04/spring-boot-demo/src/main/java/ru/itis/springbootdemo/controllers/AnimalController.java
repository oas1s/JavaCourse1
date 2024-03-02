package ru.itis.springbootdemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.springbootdemo.dto.AnimalDto;
import ru.itis.springbootdemo.services.AnimalService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping("/createAnimal")
    public String createAnimalPage(){
        return "create_animal";
    }

    @PostMapping("/createAnimal")
    public String createAnimal(AnimalDto animalDto){
        animalService.createAnimal(animalDto);
        return "redirect:/animals";
    }

    @GetMapping("/animals")
    public String getAllAnimals(ModelMap map){
        List<AnimalDto> animals =animalService.getAllAnimals();
        map.addAttribute("animals",animals);
        return "animals";
    }
}
