package com.garreffd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garreffd.dao.Dao;
import com.garreffd.entity.Suggestion;

@Service
public class SuggestionService implements ServiceInterface<Suggestion> {

	@Autowired
	Dao<Suggestion> suggestionDao;
	
	@Override
	@Transactional
	public void save(Suggestion entity) {
		suggestionDao.save(entity);
	}

	@Override
	@Transactional
	public Suggestion get(int id) {
		return suggestionDao.get(id);
	}

	@Override
	public List<Suggestion> getAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
