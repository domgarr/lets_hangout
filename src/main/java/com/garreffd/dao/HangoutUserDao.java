package com.garreffd.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.HangoutUser;

@Repository
public class HangoutUserDao implements Dao<HangoutUser> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(HangoutUser entity) {
		System.out.println("Dao doing work work.");
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public HangoutUser get(int id) {
		return null;
	}

}
