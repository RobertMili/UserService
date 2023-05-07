package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping
    List<User> getUser(){
        return userRepository.findAll();
    }
    @GetMapping("/{userId}")
    public String getName(@PathVariable("userId") Long userId) {
        return userService.getName(userId);
    }
//    @GetMapping("/{userId}/pictureLink")
//    public String getPictureLink (@PathVariable("userId") Long userId) {
//        return userService.getPictureLink(userId);
//    }
    @PostMapping
    void addUser(@RequestBody User user) {
        String name = user.getUserName();
        userRepository.save(user);
    }

}
