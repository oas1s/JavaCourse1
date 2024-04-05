package ru.itis.springdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.itis.springdemo.entity.Pet;
import ru.itis.springdemo.entity.Toy;
import ru.itis.springdemo.entity.User;
import ru.itis.springdemo.repository.PetRepository;
import ru.itis.springdemo.repository.ToyRepository;
import ru.itis.springdemo.repository.UserRepository;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PetRepository petRepository;
    private final ToyRepository toyRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder().age(23).name("Azat").surname("Faskhutdinov").build();
        User user2 = User.builder().age(18).name("Petya").surname("Petrov").build();
        User user3 = User.builder().age(25).name("Ivan").surname("Ivanov").build();

        userRepository.saveAll(Arrays.asList(user,user2,user3));

        Pet pet = Pet.builder().age(11).name("Bobik").build();
        Pet pet2 = Pet.builder().age(11).name("Jessy").build();
        Pet pet3 = Pet.builder().age(11).name("Archy").build();

        petRepository.saveAll(Arrays.asList(pet,pet2,pet3));

        Toy toy = Toy.builder().name("Little ball").build();
        Toy toy2 = Toy.builder().name("Plastic bone").build();
        Toy toy3 = Toy.builder().name("Squishy toy").build();

        toyRepository.saveAll(Arrays.asList(toy,toy2,toy3));

        pet.setUser(user);
        petRepository.save(pet);

        pet2.setUser(user);
        petRepository.save(pet2);

        pet3.setUser(user2);
        petRepository.save(pet3);
    }
}
