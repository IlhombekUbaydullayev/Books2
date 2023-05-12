package com.example.bookgradle.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Authhor extends AuditEntity {
    private String authorName;
    private String birthDate;
    private int age;
}
