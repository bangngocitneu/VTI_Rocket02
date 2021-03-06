package resource;

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
 * 
 * This class is . 
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 */
public class DatabaseConnection {
/**
 * 
 * This method is Open connection to database
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 * @return
 */
	public static Connection openConnection(){
		Connection conn = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(""));
			
		} catch (FileNotFoundException ex) {

			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();		}
	
	String url = prop.getProperty("ConnectionString");
	String user =  prop.getProperty(" username");
	String password =  prop.getProperty(" password");
	String driver =  prop.getProperty(" driverSQLName");
	try {
		conn = DriverManager.getConnection(url,user,password);
	} catch (SQLException ex) {
		ex.printStackTrace();	
	}
	return conn;
	}
	private static Connection getMySQLConnection() {
		// driver của mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String password = "Bangngocitneu58";
			return DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs){
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		if(ps != null)
			try {
				ps.close();
			} catch  (SQLException ex) {
				ex.printStackTrace();
			}
		if(rs != null)
			try {
				rs.close();
			} catch  (SQLException ex) {
				ex.printStackTrace();
			}
	}
}
