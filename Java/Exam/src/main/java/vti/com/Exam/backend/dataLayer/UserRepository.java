/**
 * 
 */
package vti.com.Exam.backend.dataLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vti.com.Exam.DatabaseConnection;
import vti.com.Exam.entity.User;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Apr 12, 2020
 */

public class UserRepository  implements IUserRepository{

	/* 
	* @see vti.com.Exam.backend.dataLayer.IUserRepository#login(java.lang.String, java.lang.String)
	*/
	
	public boolean login(String userName, String password) {
		Connection conn;
		PreparedStatement pr = null;
		ResultSet rs = null;
		conn = DatabaseConnection.openConn();
		int dem = 0;
		try {
			pr = conn.prepareStatement("SELECT 1 FROM User WHERE email=? AND password=?");
			pr.setString(1, userName);
			pr.setString(2, password);
			rs = pr.executeQuery();
			while (rs.next()) {
				dem++;
			}
			if (dem == 1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeAll(conn, pr, rs);
		}
		return false;
	}
	/* 
	* @see vti.com.Exam.backend.dataLayer.IUserRepository#getUserById(int)
	*/
	
	public boolean getUserById(int id) {
		return false;
	}

	/* 
	* @see vti.com.Exam.backend.dataLayer.IUserRepository#getUserByEmail(java.lang.String)
	*/
	
	public User getUserByEmail(String email) {
		Connection conn;
		PreparedStatement pr = null;
		ResultSet rs = null;
		conn = DatabaseConnection.openConn();
		User user = new User();
		boolean bl = false;
		try {
			pr = conn.prepareStatement("SELECT * FROM User WHERE email=?");
			
			pr.setString(1, email);
			rs = pr.executeQuery();
			
			while (rs.next()) {
				bl=true;
				user.setuId(rs.getInt("uId"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setPassword("");
			}
			if(bl) {
				return user;	
			}else {
				return null;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeAll(conn, pr, rs);
		}
		return null;
	}
	/* 
	* @see vti.com.Exam.backend.dataLayer.IUserRepository#insertUser(vti.com.Exam.entity.User)
	*/
	
	public boolean insertUser(User user) {
		Connection conn;
		PreparedStatement pr = null;
		ResultSet rs = null;
		conn = DatabaseConnection.openConn();
		
		try {
			pr = conn.prepareStatement("INSERT INTO User(firstName ,lastName,phone	,email,password)VALUES (?,?,?,?,?)");
			pr.setString(1, user.getFirstName());
			pr.setString(2, user.getLastName());
			pr.setString(3, user.getPhone());
			pr.setString(4, user.getEmail());
			pr.setString(5, user.getPassword());
			pr.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeAll(conn, pr, rs);
		}
		return false;
	}

	

	

	
}
