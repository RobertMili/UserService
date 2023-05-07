package com.example.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.util.Objects;

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
        this.pictureLink = pictureLink;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
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
