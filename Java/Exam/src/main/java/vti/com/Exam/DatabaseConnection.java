/**
 * 
 */
package vti.com.Exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * This class is . Connection JDBC
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Apr 12, 2020
 */

public class DatabaseConnection {

	/**
	 * 
	 * This method is . open connection
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @return
	 */
	public static Connection openConn() {

		Connection conn = null;

		// get property

		Properties propertiesFile = new Properties();
		try {
			propertiesFile.load(new FileInputStream("src/main/resource/jdbc.properties"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		String url = propertiesFile.getProperty("connectionString");
		String user = propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver = propertiesFile.getProperty("driverSQLName");

		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;

	}
	/**
	 * 
	 * This method is . close connection
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param conn
	 * @param pr
	 * @param rs
	 */
	
	public static void closeAll( Connection conn, PreparedStatement pr, ResultSet rs){
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (pr != null)
			try {
				pr.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
