package com.saracks.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UserAccount {

	@Id
	@GeneratedValue
	private Long userID;

	@OneToMany(mappedBy = "userAccount", cascade = CascadeType.ALL)
	private List<Note> notes = new ArrayList<>();

	private String username;

	private String email;

	private String password;

	public UserAccount() {
	}

	public UserAccount(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
