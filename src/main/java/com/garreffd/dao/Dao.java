package com.garreffd.dao;

public interface Dao<E> {
	public void save(E entity);
	public E get(int id);
}
