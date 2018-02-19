package com.garreffd.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.Hangout;

@Repository
public class HangoutDaoImpl implements Dao<Hangout> {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Hangout entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public Hangout get(int id) {
		return sessionFactory.getCurrentSession().get(Hangout.class, id);

	}
}
