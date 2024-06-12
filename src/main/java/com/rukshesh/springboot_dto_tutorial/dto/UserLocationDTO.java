package com.rukshesh.springboot_dto_tutorial.dto;

import lombok.Data;

/**
 * This class will transfer User and Location details from Server to Client
 * Make sure that the model attributes and DTO attributes should be same because
 * whenever we are doing mapping between  DTO and Entity. Data won't be populated
 * if attributes are not same
 */
@Data
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
