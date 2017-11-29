package com.jdbc.project.coupling;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JDBCTest1 {
	public String driverClass = null;
	public String url = null;
	public String user = null;
	public String password = null;

	// ЗїсоєП

	public void connnection() throws SQLException {
		Driver driver = new Driver();
		url = "jdbc:mysql://localhost:3306/practice";
		Properties info = new Properties();
		info.put("user", "HkisY");
		info.put("password", "lzcgy123456!!!");
		Connection connection = driver.connect(url, info);
		System.out.println(connection);
	}

	
}
