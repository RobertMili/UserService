package com.example.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
public class User {


    @Id
    @GeneratedValue
    private Long id;

    @Lob
    private String userName;
    private String pictureLink;



    public User(Long id, String userName, String pictureLink) {
        this.id = id;
        this.userName = userName;

    }

    public User() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(pictureLink, user.pictureLink);
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
