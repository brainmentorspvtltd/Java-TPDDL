package com.srivastava.mvcwithjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public String add(User user) {
		int record = jdbcTemplate.update("insert into user_mst (userid, password) values(?,?)",new Object[] {
				user.getUserid(), user.getPwd()
		});
		return record>0?"Register SuccessFully":"Not Registerd";
	}
}
