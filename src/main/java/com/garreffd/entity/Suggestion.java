package com.garreffd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suggestion")
public class Suggestion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="suggestion")
	private String suggestion;
	
	@Column(name="vote_count")
	private int voteCount;

	public Suggestion() {}
	
	public Suggestion(String suggestion) {
		this.suggestion = suggestion;
		voteCount = 0;
	}
	

	public int getId() {
		return id;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	
	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	
	}
	
	public void incrementVoteCount() {
		voteCount++;
	}

	@Override
	public String toString() {
		return "Suggestion [id=" + id + ", suggestion=" + suggestion + ", voteCount=" + voteCount + "]";
	}
	
	
	
}
