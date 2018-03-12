package com.garreffd.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poll_data")
public class PollData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="poll_id")
	int pollId;
	
	@Id
	@Column(name="username_id")
	String usernameId;
	
	@Column(name="voted")
	byte voted;

	public PollData() {
	}
	
	//TODO: rename constructor variable
	public PollData(int suggestionId, String usernameId, byte voted) {
		this.pollId = suggestionId;
		this.usernameId = usernameId;
		this.voted = voted;
	}

	public int getPollId() {
		return pollId;
	}

	public void setPollId(int suggestionId) {
		this.pollId = suggestionId;
	}

	public String getUsernameId() {
		return usernameId;
	}

	public void setUsernameId(String usernameId) {
		this.usernameId = usernameId;
	}

	public byte getVoted() {
		return voted;
	}

	public void setVoted(byte voted) {
		this.voted = voted;
	}
	
	public String getVotedAsString() {
		return String.valueOf(voted);
	}
	
	
}
