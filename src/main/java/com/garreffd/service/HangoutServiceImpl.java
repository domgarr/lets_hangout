package com.garreffd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garreffd.dao.Dao;
import com.garreffd.entity.Hangout;

@Service
public class HangoutServiceImpl implements ServiceInterface<Hangout> {
	@Autowired
	Dao<Hangout> hangoutDao;
	
	@Override
	@Transactional
	public void save(Hangout entity) {
		hangoutDao.save(entity);		
	}

	@Override
	@Transactional
	public Hangout get(int id) {
		return hangoutDao.get(id);
	}
}
