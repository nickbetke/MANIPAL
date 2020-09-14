package com.manipal.service;

import java.util.List;

import com.manipal.model.Telephone;

public interface ITelephoneService {
	long count();
	String add(Telephone t);
	List<Telephone> showAll();
	Telephone getById(int id);
	String deleteById(int id);
	void update(Telephone t);
	Telephone getByTel(String tel);
}
