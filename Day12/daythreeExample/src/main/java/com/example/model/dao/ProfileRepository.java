package com.example.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.beans.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
	
}
