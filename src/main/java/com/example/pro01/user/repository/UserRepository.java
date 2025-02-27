package com.example.pro01.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pro01.user.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Optional<User> findByNickname(String nickname);
}
