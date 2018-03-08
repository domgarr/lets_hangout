package com.garreffd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garreffd.entity.Suggestion;

@Repository
public class SuggestionDao implements Dao<Suggestion>{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Suggestion entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public Suggestion get(int id) {
		return sessionFactory.getCurrentSession().get(Suggestion.class, id);
	}

	@Override
	public List<Suggestion> getAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
