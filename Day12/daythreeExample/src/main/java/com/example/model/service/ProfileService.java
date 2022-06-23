package com.example.model.service;

import java.util.List;

import com.example.exceptions.ProfileNotFoundException;
import com.example.model.beans.Profile;

public interface ProfileService {
	
	public Profile storeProfile(Profile profile);
	
	public List<Profile> fetchProfiles();
	
	public Profile fetchProfile(int id) throws ProfileNotFoundException;
	
}
