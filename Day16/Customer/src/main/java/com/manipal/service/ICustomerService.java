package com.manipal.service;

import java.util.List;

import com.manipal.model.Customer;

public interface ICustomerService {
	List<Customer> showAll();
	String add(Customer c);
	void update(Customer c);
	Customer getById(int id);
	String delete(int id);
	long count();
	
}
