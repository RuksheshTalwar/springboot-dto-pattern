package com.rukshesh.springboot_dto_tutorial.service;

import com.rukshesh.springboot_dto_tutorial.dto.UserLocationDTO;
import com.rukshesh.springboot_dto_tutorial.model.User;
import com.rukshesh.springboot_dto_tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUserLocation() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());


    }

    /**
     * This method is to convert User JPA Entity to UserLocationDTO -> this UserLocationDTO contains all the information
     * regarding User and Location Entities
     */
    private UserLocationDTO convertEntityToDTO(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        return userLocationDTO;
    }
}
