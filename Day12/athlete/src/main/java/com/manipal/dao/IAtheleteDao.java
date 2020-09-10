package com.manipal.dao;

import java.util.List;

import com.manipal.model.Athlete;


public interface IAtheleteDao {
	
	public List<Athlete> showAthlete();
	public int addAthlete(Athlete a);
}
