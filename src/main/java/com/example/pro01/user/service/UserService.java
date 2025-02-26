package com.example.pro01.user.service;

import com.example.pro01.common.exception.CustomException;
import com.example.pro01.common.exception.Message;
import com.example.pro01.common.exception.SuccessEnum;
import com.example.pro01.user.dto.SignupRequestDto;
import com.example.pro01.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.pro01.user.entity.User;

import java.util.Optional;

import static com.example.pro01.common.exception.ExceptionEnum.*;
import static com.example.pro01.common.exception.SuccessEnum.*;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public ResponseEntity<Message> signupUser (SignupRequestDto signupRequestDto) {             // fix: 수정 필요
        User user = new User(signupRequestDto.getUsername(), signupRequestDto.getPassword(), signupRequestDto.getNickname(), signupRequestDto.getEmail());
        Optional<User> found = userRepository.findByUsername(signupRequestDto.getUsername());

        if (found.isPresent()) {
            throw new CustomException(DUPLICATE_USERNAME);
        }

        userRepository.save(user);

        return Message.toResponseEntity(USER_CREATED);
    }
}
