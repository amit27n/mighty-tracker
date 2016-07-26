package com.mt.tracker.mighty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerDAOFactory extends DAOFactory {
	private String url;
    private String username;
    private String password;
	public DriverManagerDAOFactory(String jdbcUrl, String username, String password) {
		this.url=jdbcUrl;
		this.username=username;
		this.password=password;
	}
	
	@Override
	Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url, username, password);
		
	}
	
	
	
}
