package com.misiontic.practica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.practica.entities.Profile;

@Repository
public interface ProfileRepository 
    extends JpaRepository<Profile, Long> {
}
