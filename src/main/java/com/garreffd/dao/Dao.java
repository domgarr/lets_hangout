package com.garreffd.dao;

import java.util.List;

public interface Dao<E> {
	public void save(E entity);
	public E get(int id);
	public List<E> getAll(String id);
}
