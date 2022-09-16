package com.misiontic.practica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.practica.entities.Profile;
import com.misiontic.practica.services.ProfileServices;


@RestController
public class ControladorProfile {
	@Autowired private ProfileServices profileServices;

	@PostMapping("/profile")
	public Profile saveProfile(
			@Validated @RequestBody Profile profile) {
		return profileServices.saveProfile(profile);
	}

	@GetMapping("/profile")
	public List<Profile> fetchProfileList() {
		return profileServices.fetchProfileList();
	}

 
	// Update operation
	@PutMapping("/profile/{id}")
	public Profile updateProfile(@RequestBody Profile profile,
			@PathVariable("id") Long profileId) {
		return profileServices.updateProfile(
            profile, profileId);
	}

	// Delete operation
	@DeleteMapping("/profile/{id}")
	public String deleteId(@PathVariable("id") Long profileId) {
		profileServices.deleteProfileId(
            profileId);
		return "Deleted Successfully";
	}
}