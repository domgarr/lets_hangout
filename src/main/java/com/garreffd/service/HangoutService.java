package com.garreffd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garreffd.dao.Dao;
import com.garreffd.entity.Hangout;

@Service
public class HangoutService implements ServiceInterface<Hangout> {
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
	
	//This will not be in the interface, since I don't believe all entities need this behavior. 
	@Transactional
	public List<Hangout> getHangouts(String username){
		return ((HangoutService)hangoutDao).getHangouts(username);
	}
	
}
