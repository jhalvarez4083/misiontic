package com.misiontic.practica.Interfaces;

import java.util.List;

import com.misiontic.practica.entities.Profile;


public interface ProfileInterface {
    // Save operation
    Profile saveProfile(Profile profile);
 
    // Read operation
    List<Profile> fetchProfileList();
 
    // Update operation
    Profile updateProfile(Profile profile,
                                Long profileId);
 
    // Delete operation
    void deleteProfileId(Long profileId);
}