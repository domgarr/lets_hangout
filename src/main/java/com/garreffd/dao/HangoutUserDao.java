package com.garreffd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.Hangout;
import com.garreffd.entity.HangoutUser;

@Repository
public class HangoutUserDao implements Dao<HangoutUser> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(HangoutUser entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public HangoutUser get(int id) {
		return null;
	}

	@Override
	public List<HangoutUser> getAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
