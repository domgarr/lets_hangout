package com.garreffd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.Hangout;

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
	
	public List<Hangout> getHangouts(String username){
		Session session = sessionFactory.getCurrentSession();
		Query<Hangout> query = session.createQuery(
				"SELECT hangout.id, hangout.title, hangout.description "
				+"FROM hangout, hangout_user\r\n" + 
				"where hangout.id = hangout_user.hangout_id" 
				, Hangout.class);
		
		return query.getResultList();
	}
}
