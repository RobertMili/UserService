package com.example.userservice.service;

import com.example.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getName(Long userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found")).getUserName();
    }
    public String getPictureLink (Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found")).getPictureLink();
    }
}
