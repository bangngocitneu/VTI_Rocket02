/**
 * 
 */
package vti.com.Exam.backend.dataLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vti.com.Exam.DatabaseConnection;
import vti.com.Exam.entity.Employee;

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

public class EmployeeRepository implements IEmployeeRepository{

	/* 
	* @see vti.com.Exam.backend.dataLayer.IEmployeeRepository#insertEmployee(vti.com.Exam.entity.Employee)
	*/
	
	public boolean insertEmployee(Employee empl) {

		Connection conn;
		PreparedStatement pr = null;
		ResultSet rs = null;
		conn = DatabaseConnection.openConn();
		try {
			pr = conn.prepareStatement("INSERT INTO Employee (Uid ,projectName,proSkill) VALUES (? , ?,?)");
			pr.setInt(1, empl.getUser().getuId());
			pr.setString(2, empl.getProjectName());
			pr.setString(3, empl.getProSkill());
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
