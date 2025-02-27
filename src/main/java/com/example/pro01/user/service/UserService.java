package com.example.pro01.user.service;

import com.example.pro01.common.exception.CustomException;
import com.example.pro01.common.exception.ExceptionEnum;
import com.example.pro01.common.exception.Message;
import com.example.pro01.common.exception.SuccessEnum;
import com.example.pro01.user.dto.SignupRequestDto;
import com.example.pro01.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.pro01.user.entity.User;

import java.util.Optional;

//import static com.example.pro01.common.exception.ExceptionEnum.*;
import static com.example.pro01.common.exception.SuccessEnum.*;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public ResponseEntity<Message> signupUser (SignupRequestDto signupRequestDto) {
        User user = User.builder()
                .username(signupRequestDto.getUsername())
                .password(passwordEncoder.encode(signupRequestDto.getPassword()))
                .email(signupRequestDto.getEmail())
                .nickname(signupRequestDto.getNickname())
                .build();

        Optional<User> found = userRepository.findByUsername(signupRequestDto.getUsername());

        if (found.isPresent()) {
            throw new CustomException(ExceptionEnum.DUPLICATE_USERNAME);
        }

        userRepository.save(user);

        return Message.toResponseEntity(USER_CREATED);
    }
}
