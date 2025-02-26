package com.example.pro01.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupRequestDto {
    private String username;

    private String password;

    private String nickname;

    private String email;
}
