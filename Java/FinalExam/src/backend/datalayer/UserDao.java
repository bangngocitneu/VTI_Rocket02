package backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import entity.User;

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
public class UserDao implements IUserDao{

	
	@Override
	public boolean login(String email, String password) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		//conn = 
		return false;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
