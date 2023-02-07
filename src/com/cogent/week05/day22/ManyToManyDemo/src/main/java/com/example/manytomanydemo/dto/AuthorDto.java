package com.example.manytomanydemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthorDto {
    private Long id;
    private String firstName;
    private String lastName;
}
