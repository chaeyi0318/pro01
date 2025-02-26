package com.example.pro01.user.entity;

import com.example.pro01.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "users")
public class Users extends BaseEntity {
    @Column(nullable = false)
    private String username;
}