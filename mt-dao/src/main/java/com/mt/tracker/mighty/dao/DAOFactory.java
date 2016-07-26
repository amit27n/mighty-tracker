package com.mt.tracker.mighty.dao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAOFactory {
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; 
	private static final String jdbcURL="jdbc:oracle:thin:@localhost:1521/new1pdb.home";
	private static final String userName="Test1";
	private static final String password="Omsairam12";
	
		public static DAOFactory getInstance(){
			
			try {
				Class.forName(JDBC_DRIVER);
			} catch (ClassNotFoundException e) {
				System.out.println("Driver Class not found");
				e.printStackTrace();
			}
				DAOFactory instance;
				instance=new DriverManagerDAOFactory(jdbcURL,userName,password);
				return instance;
		}
		
		 abstract Connection getConnection() throws SQLException;
		 
		 public EntityDAO getEntityDAO() {
		        return new EntityDAO(this);
		    }
}
