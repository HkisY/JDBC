package com.jdbc.project.decoupling;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JDBCTest2 {
	public String driverClass = null;
	public String url = null;
	public String user = null;
	public String password = null;
	
	//Ѕвсо
	
	public Connection getConnection() throws Exception {
		Driver driver = new Driver();
		Properties info = new Properties();
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		info.load(in);
		driverClass = info.getProperty("driver");
		url = info.getProperty("jdbcUrl");
		user = info.getProperty("user");
		password = info.getProperty("password");
		info.put("user", user);
		info.put("password",password);
		Connection connection = driver.connect(url, info);
		
		return connection;

	}
	
	public void connectionTest() throws Exception{
		System.out.println(getConnection());
	}
	

	
}
