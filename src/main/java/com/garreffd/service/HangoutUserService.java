package com.garreffd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garreffd.dao.Dao;
import com.garreffd.entity.HangoutUser;

@Service
public class HangoutUserService implements ServiceInterface<HangoutUser> {

	@Autowired
	Dao<HangoutUser> hangoutUserDao;
	
	@Override
	@Transactional
	public void save(HangoutUser entity) {
		System.out.println("Service doing work.");
		hangoutUserDao.save(entity);
	}

	@Override
	public HangoutUser get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HangoutUser> getAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
