/**
 * 
 */
package vti.com.Exam.backend.dataLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vti.com.Exam.DatabaseConnection;
import vti.com.Exam.entity.Manager;

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

public class ManagerRepository implements IManagerRepository{

	/* 
	* @see vti.com.Exam.backend.dataLayer.IManagerRepository#insertManager(vti.com.Exam.entity.Manager)
	*/
	
	public boolean insertManager(Manager mn) {
		Connection conn;
		PreparedStatement pr = null;
		ResultSet rs = null;
		conn = DatabaseConnection.openConn();
		
		try {
			pr = conn.prepareStatement("INSERT INTO Manager (Uid ,expInYear) VALUES 	(?,?)");
			pr.setInt(1, mn.getUser().getuId());
			pr.setInt(2, mn.getExpInYear());
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeAll(conn, pr, rs);
		}
		
		return false;
	}

}
