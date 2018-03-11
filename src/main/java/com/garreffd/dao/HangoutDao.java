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
public class HangoutDao implements Dao<Hangout> {
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

	@Override
	public List<Hangout> getAll(String id) {
		String hql = "from Hangout where id in ( select hangoutUser.hangoutId from HangoutUser as hangoutUser  where userId = '" + id + "' )";
			 
		Session session = sessionFactory.getCurrentSession();
		Query<Hangout> query = session.createQuery(hql, Hangout.class);
		
		return query.getResultList();
	}
}
