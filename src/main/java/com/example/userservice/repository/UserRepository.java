package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User,Long> {
}
