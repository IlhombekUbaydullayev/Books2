package com.example.bookgradle.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Images extends AuditEntity {
    private String xs;
    private String sm;
    private String md;
    private String lg;
}
