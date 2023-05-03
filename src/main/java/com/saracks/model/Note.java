package com.saracks.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Note {

	@Id
	@GeneratedValue
	private Long noteId;

	@ManyToOne
	@JoinColumn(name = "user_account_id")
	private UserAccount userAccount;

	
	private String notes;
	
	public Note() {
	    
	}

	public Note( String notes) {
	    this.notes = notes;
	}
	public Long getNoteId() {
	    return noteId;
	}

	public UserAccount getUser() {
	    return userAccount;
	}

	public void setUser(UserAccount user) {
	    this.userAccount = user;
	}

	public String getNotes() {
	    return notes;
	}

	public void setNotes(String notes) {
	    this.notes = notes;
	}


}
