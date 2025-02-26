package com.example.pro01.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pro01.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
