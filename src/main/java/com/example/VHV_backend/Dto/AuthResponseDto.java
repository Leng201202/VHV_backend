package com.example.VHV_backend.Dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String tokenType="Bearer ";
    private String token;
    private String role;
    public AuthResponseDto(String token){
        this.token=token;
    }
    public AuthResponseDto(String token, String role) {
        this.token = token;
        this.role = role;
    }
}
