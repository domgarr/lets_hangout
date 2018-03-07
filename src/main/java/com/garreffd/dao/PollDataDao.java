package com.garreffd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.PollData;

@Repository
public class PollDataDao implements Dao<PollData>{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(PollData entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public PollData get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PollData> getAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
