package backend.datalayer;

import java.util.List;

import entity.User;

/**
 * 
 * This class is interface of UserDao
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 */
public interface IUserDao {

	//login
	boolean login(String email,String password);
	//get All user
	List<User> getAllUser();
	//insert user
	boolean insertUser(User user) throws Exception;
	// get user by email
	User getUserByEmail(String email);
}
