package com.example.media.services;

import com.example.media.models.SocialUser;
import com.example.media.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;


    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }


    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }
}
