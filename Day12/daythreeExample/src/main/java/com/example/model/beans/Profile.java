package com.example.model.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private long phone;
	private LocalDate dob;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "profileidref")
	private List<Friend> friends;
	
	public List<Friend> getFriends() {
		return friends;
	}
	
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	
	public int getProfileId() {
		return profileId;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	
}
