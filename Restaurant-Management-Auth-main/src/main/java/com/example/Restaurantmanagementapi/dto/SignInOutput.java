package com.example.Restaurantmanagementapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInOutput {

    private String status;
    private String token;
}
