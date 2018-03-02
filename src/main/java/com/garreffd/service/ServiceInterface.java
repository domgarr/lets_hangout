package com.garreffd.service;

public interface ServiceInterface<E> {
	public void save(E entity);
	public E get(int id);
}
