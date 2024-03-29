package ru.itis.springdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.springdemo.dto.UserDto;
import ru.itis.springdemo.entity.Pet;
import ru.itis.springdemo.entity.User;
import ru.itis.springdemo.repository.PetRepository;
import ru.itis.springdemo.repository.ToyRepository;
import ru.itis.springdemo.repository.UserRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final PetRepository petRepository;
    private final ToyRepository toyRepository;

    @GetMapping("/user/find")
    public String findUser(@RequestParam(name = "userId") Long userId){
        User user = userRepository.findById(userId).get();
        System.out.println(user);
        return "Success";
    }

    @GetMapping("/user/{userId}/pet/add")
    public String addUserPet(@PathVariable(name = "userId") Long userId, @RequestParam(name = "petId") Long petId){
        User user = User.builder().id(userId).build();
        Pet pet = petRepository.findById(petId).get();
        pet.setUser(user);
        petRepository.save(pet);
        return "Success!";
    }

    @GetMapping("/user/findAll")
    public List<UserDto> findUsers(){
        return userRepository.findAll().stream().map(UserDto::fromEntity).toList();
    }

}
