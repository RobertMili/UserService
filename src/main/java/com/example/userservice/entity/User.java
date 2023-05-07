package com.example.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
