package com.garreffd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garreffd.dao.Dao;
import com.garreffd.entity.PollData;

@Service
public class PollDataService implements ServiceInterface<PollData> {

	@Autowired
	Dao<PollData> pollDataDao;

	@Override
	@Transactional
	public void save(PollData entity) {
		pollDataDao.save(entity);
		
	}

	@Override
	public PollData get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PollData> getAll(String usernameId) {
		return pollDataDao.getAll(usernameId);
	}
	
	

}
