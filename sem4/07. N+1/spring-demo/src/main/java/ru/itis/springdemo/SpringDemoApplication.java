package ru.itis.springdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itis.springdemo.entity.Pet;
import ru.itis.springdemo.entity.Toy;
import ru.itis.springdemo.entity.User;
import ru.itis.springdemo.repository.PetRepository;
import ru.itis.springdemo.repository.ToyRepository;
import ru.itis.springdemo.repository.UserRepository;

import java.util.Arrays;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
