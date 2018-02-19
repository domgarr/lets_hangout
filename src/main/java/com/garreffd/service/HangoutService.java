package com.garreffd.service;

public interface HangoutService<E> {
	public void save(E entity);
	public E get(int id);
}
