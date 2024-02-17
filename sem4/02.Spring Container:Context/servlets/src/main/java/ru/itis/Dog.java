package ru.itis;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String makeSound() {
        return "bow wow!";
    }
}
