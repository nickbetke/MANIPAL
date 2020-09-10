package com.manipal.dao;
import com.manipal.model.Athlete;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.model.Athlete;


public class AthleteDao implements IAtheleteDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAthlete(Athlete a) {
		String query = "INSERT INTO Athlete VALUES(?,?,?,?,?)";
		int status = jdbcTemplate.update(query, a.getName(), a.getGender(), a.getCategory(), a.getMail(), a.getMobile());
		return 0;
		
	}

//	@SuppressWarnings("unchecked")
	@Override
	public List<Athlete> showAthlete() {
		String sql = "SELECT * FROM Athlete";
		List<Athlete> Athletes = jdbcTemplate.query(sql, new AthleteResultSetExtractor());
		return Athletes;
		
	}


}
