package com.tatapowers.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int add(String userid, String pwd) {
		return jdbcTemplate.update("insert into user_mst (userid, password) values(?,?)",
				new Object[] {userid , pwd});
	}

}
