package ru.itis.springdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pet {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "pet_toys",
        joinColumns = {@JoinColumn(name = "pet_id")},
        inverseJoinColumns = {@JoinColumn(name = "toy_id")})
    private Set<Toy> toys;
}
