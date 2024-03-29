package ru.itis.springdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.springdemo.entity.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String surname;

    private Integer age;

    private List<PetDto> pets;

    public static UserDto fromEntity(User user){
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .age(user.getAge())
                .pets(user.getPets().stream().map(PetDto::fromEntity).toList())
                .build();
    }
}
