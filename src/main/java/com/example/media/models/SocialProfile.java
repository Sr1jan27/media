package com.example.media.models;

import jakarta.persistence.*;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private SocialUser user;
}
