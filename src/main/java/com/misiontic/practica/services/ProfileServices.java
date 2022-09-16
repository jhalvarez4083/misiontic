package com.misiontic.practica.services;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.misiontic.practica.Interfaces.ProfileInterface;

import com.misiontic.practica.entities.Profile;

import com.misiontic.practica.repositories.ProfileRepository;

@Service

public class ProfileServices implements ProfileInterface {

    @Autowired private ProfileRepository profileRepository;

    @Override
    public Profile saveProfile(Profile profile) {
        // TODO Auto-generated method stub
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> fetchProfileList() {
        // TODO Auto-generated method stub
        return (List<Profile>) profileRepository.findAll();
    }

    @Override
    public Profile updateProfile(Profile profile, Long profileId) {
        // TODO Auto-generated method stub
        Profile item = profileRepository.findById(profileId)
                .get();

        if (Objects.nonNull(profile.getImage())
                && !"".equalsIgnoreCase(
                    profile.getImage())) {
            item.setImage(
                profile.getImage());
        }
        if (Objects.nonNull(profile.getPhone())
                && !"".equalsIgnoreCase(
                    profile.getPhone())) {
            item.setPhone(
                    profile.getPhone());
        }

       
               
        
        return profileRepository.save(item);
    }

    @Override
    public void deleteProfileId(Long profileId) {
        // TODO Auto-generated method stub
        profileRepository.deleteById(profileId);
    }

   

}

