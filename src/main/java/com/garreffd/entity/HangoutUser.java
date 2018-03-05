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

/*
 *  Single Id classes do not need to be Serializable since 
 *  primitive types are Serializable by default.
 */

@Entity
@Table(name="hangout_user")
public class HangoutUser implements Serializable  {
	
	/*
	 *  Since I do not plan to change the class in the future, a
	 *  default UID will do.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hangout_id")
	private int hangoutId;
	
	@Id
	@Column(name="user_id")
	private String userId;

	public HangoutUser(int hangout_id, String user_id) {
		this.hangoutId = hangout_id;
		this.userId = user_id;
	}

	public HangoutUser() {
	}
	
	public int getHangoutId() {
		return hangoutId;
	}

	public void setHangoutId(int hangout_id) {
		this.hangoutId = hangout_id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String user_id) {
		this.userId = user_id;
	}

	
	

	
}
