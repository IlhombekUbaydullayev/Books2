package com.example.bookgradle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Books extends AuditEntity {
    private String name;
    private String title;
    private String body;
    @OneToOne
    private Authhor authhor;
    @OneToOne
    private Images images;
    @OneToOne
    private Address address;
}
