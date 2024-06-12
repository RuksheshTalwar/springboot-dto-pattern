package com.rukshesh.springboot_dto_tutorial.controller;

import com.rukshesh.springboot_dto_tutorial.dto.UserLocationDTO;
import com.rukshesh.springboot_dto_tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation() {
        return userService.getAllUserLocation();
    }


}
