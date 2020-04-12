package baitap.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baitap.Student;
/**
 * 
 * This class is . 
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 26, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 26, 2020
 */
public class ConnMySQL {

	// Kết nối vào MySQL.
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

	public static Integer insertRecords(String firstName, String lastName, String className, float mathScores,
			float chemistryScores, String sql) {
		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		try {
			Integer id = null;
			conn = getMySQLConnection();
			pre = conn.prepareStatement(sql, pre.RETURN_GENERATED_KEYS);
			pre.setString(1, firstName);
			pre.setString(2, lastName);
			pre.setString(3, className);
			pre.setFloat(4, mathScores);
			pre.setFloat(5, chemistryScores);
			pre.executeUpdate();
			rs = pre.getGeneratedKeys();
			while (rs.next()) {
				id = rs.getInt(1);
				return id;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pre.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static List<Student> query(String sql) {
		List<Student> result = new ArrayList<Student>();
		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		try {

			conn = getMySQLConnection();
			pre = conn.prepareStatement(sql);
			/*
			 * stmt.setInt(1, 1); stmt.setString(2, "nguyen"); stmt.setString(3,
			 * "ngoc"); stmt.setString(4, "cntt"); stmt.setFloat(5, 7);
			 * stmt.setFloat(6, 8);
			 */
			// stmt.execute();
			// select all student
			// stmt = conn.prepareStatement(sqlInsert);
			// get data from table student
			rs = pre.executeQuery();
			// show data
			while (rs.next()) {
				Student model = new Student();
				model.setId(rs.getInt("id"));
				model.setFirstName(rs.getString("firstName"));
				model.setLastName(rs.getString("lastName"));
				model.setClassName(rs.getString("className"));
				model.setMathScores(rs.getFloat("mathScores"));
				model.setChemistryScores(rs.getFloat("chemistryScores"));
				result.add(model);
				/*
				 * System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
				 * + rs.getString(3) + " " + rs.getString(4)+ " " +
				 * rs.getFloat(5) + " " + rs.getFloat(6));
				 */
			}
			return result;

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				pre.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;

	}
}
