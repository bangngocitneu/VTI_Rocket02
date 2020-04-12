package com.vti.template.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConn {
public static void main(String[] args) {
	String jdbcUrl = "jdbc:mysql://localhost:3306/FinalExam?autoReconnect=true&useSSL=false&characterEncoding=latin1";

	try {
		// connect database
		// username & password
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "Bangngocitneu58");

		Class.forName("com.mysql.cj.jdbc.Driver");

		// connect
		Connection connection = DriverManager.getConnection(jdbcUrl, properties);
		System.out.println("Connect successful!");

	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
