package ru.itis.springdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.springdemo.entity.Toy;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToyDto {

    private String name;


    public static ToyDto fromEntity(Toy toy) {
        return ToyDto.builder()
                .name(toy.getName())
                .build();
    }
}
