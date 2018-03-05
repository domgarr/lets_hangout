package com.garreffd.service;

import java.util.List;

public interface ServiceInterface<E> {
	public void save(E entity);
	public E get(int id);
	public List<E> getAll(String id);
}
