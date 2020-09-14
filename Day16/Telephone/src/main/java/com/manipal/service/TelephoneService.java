package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Telephone;
import com.manipal.repository.ITelephoneRepository;

@Service
public class TelephoneService implements ITelephoneService{
	@Autowired ITelephoneRepository repo;
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public String add(Telephone t) {
		// TODO Auto-generated method stub
		repo.save(t);
		return "Added";
	}

	@Override
	public List<Telephone> showAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Telephone getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public void update(Telephone t) {
		repo.save(t);
		
	}

	@Override
	public Telephone getByTel(String tel) {
		// TODO Auto-generated method stub
		List<Telephone> tlist = repo.findAll();
		for(Telephone t: tlist) {
			if(tel.equals(t.getTelNo())) {
				return t;
			}
		}
		return null;
	}
	
	
}	
