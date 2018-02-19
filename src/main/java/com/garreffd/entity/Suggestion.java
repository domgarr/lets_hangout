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
	
	@Column(name="voteCount")
	private int voteCount;

	public Suggestion() {
		voteCount = 0;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Suggestion [id=" + id + ", suggestion=" + suggestion + ", voteCount=" + voteCount + "]";
	}
	
	
	
}
