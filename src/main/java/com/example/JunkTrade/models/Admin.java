package com.example.JunkTrade.models;

import lombok.*;

import javax.persistence.*;

@Entity(name="admin")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email; // userId of admin
    @Column(unique = true, nullable = false)
    private String password;

    @Column(name = "roles",nullable = false)
    private String roles="ROLE_ADMIN";
}

