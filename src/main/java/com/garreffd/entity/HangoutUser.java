package com.garreffd.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hangout_user")
public class HangoutUser implements Serializable  {
	
	@Id
	@Column(name="hangout_id")
	private int hangout_id;
	
	@Id
	@Column(name="user_id")
	private String user_id;

	
	public int getHangout_id() {
		return hangout_id;
	}

	public void setHangout_id(int hangout_id) {
		this.hangout_id = hangout_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public HangoutUser(int hangout_id, String user_id) {
		this.hangout_id = hangout_id;
		this.user_id = user_id;
	}

	
}
