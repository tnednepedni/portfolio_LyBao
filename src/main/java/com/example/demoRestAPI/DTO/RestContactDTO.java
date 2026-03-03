package com.example.demoRestAPI.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RestContactDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Ten phai trong khoang nay")
    private String name;

    @Email
    @NotBlank(message = "Can phai nhap email")
    private String email;

    @NotBlank
    @Size(min = 3, max = 100, message = "Xin hay de lai mot loi nhan truoc khi send a")
    private String message;
}