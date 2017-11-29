package com.jdbc.project.drivermanager;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JDBCTest3 {
	public String driverClass = null;
	public String url = null;
	public String user = null;
	public String password = null;
	
	//解耦
	//@Test
	public void driverManagerGetConnection() throws Exception {
		Properties info = new Properties();
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		info.load(in);
		driverClass = info.getProperty("driver");
		url = info.getProperty("jdbcUrl");
		user = info.getProperty("user");
		password = info.getProperty("password");
		info.put("user", user);
		info.put("password",password);
		//加载驱动程序
		//Class.forName(driverClass);
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
		

	}
	

	
}
