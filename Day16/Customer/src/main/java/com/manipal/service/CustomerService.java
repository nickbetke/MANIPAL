package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Customer;
import com.manipal.repository.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public List<Customer> showAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String add(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);
		return "Customer Added";
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted!";
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public void update(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);
//		return "upated!";
	}
	
	
	
}
