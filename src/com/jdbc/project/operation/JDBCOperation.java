package com.jdbc.project.operation;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.jdbc.project.decoupling.JDBCTest2;



public class JDBCOperation {
	@Test
	public void JDBCQuery() throws Exception{
		JDBCTest2 JdbcTest2 = new JDBCTest2();
		Connection connection = JdbcTest2.getConnection();
		String sql = "select name,email from people where id = 3";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		String name = null;
		int email = 0;
		if (resultSet.next()) {
			name = resultSet.getString(1);
			email = resultSet.getInt(2);
			
		}
		System.out.println(name+" "+email);
		resultSet.close();
		statement.close();
		connection.close();
	}
	
	
	
	public void JDBCUpdate() throws Exception{
		JDBCTest2 JdbcTest2 = new JDBCTest2();
		Connection connection = JdbcTest2.getConnection();
		
		String sqlInsert = "insert into people (name,email) values ('xiaoming',6)";
		String sqlDelete = "delete from people where id = 1";
		String sqlUpdate = "update people set name = 'xiaowang' where id = 2";
		Statement statement =  connection.createStatement();
		statement.executeUpdate(sqlUpdate);
		statement.close();
		connection.close();
	}
}
