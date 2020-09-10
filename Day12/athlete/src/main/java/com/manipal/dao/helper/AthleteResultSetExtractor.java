package com.manipal.dao.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.model.Athlete;
//import com.manipal.model.User;

public class AthleteResultSetExtractor implements ResultSetExtractor {

	@Override
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Athlete> Athletes = new ArrayList<>();
		while(rs.next()) {
			Athlete athlete = new Athlete();
			athlete.setName(rs.getString(1));
			athlete.setGender(rs.getString(2));
			athlete.setCategory(rs.getString(3));
			athlete.setMail(rs.getString(4));
			athlete.setMobile(rs.getLong(5));
			Athletes.add(athlete);
			
			}
		
		return Athletes;
		
	}

}
