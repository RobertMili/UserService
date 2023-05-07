package com.example.userservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;

    public UserDto() {

    }

    public UserDto(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                '}';
    }
}
