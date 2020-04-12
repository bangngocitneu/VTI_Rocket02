/**
 * 
 */
package vti.com.Exam.backend.businessLayer;

import vti.com.Exam.backend.dataLayer.IUserRepository;
import vti.com.Exam.backend.dataLayer.UserRepository;
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

public class UserServiceImplement implements UserService{
	private IUserRepository iUserRepository;
	public UserServiceImplement(){
		iUserRepository = new UserRepository();
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.UserService#login(java.lang.String, java.lang.String)
	*/
	
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return iUserRepository.login(userName, password);
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.UserService#insertUser(vti.com.Exam.entity.User)
	*/
	
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return iUserRepository.insertUser(user);
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.UserService#getUserById(int)
	*/
	
	public boolean getUserById(int id) {
		// TODO Auto-generated method stub
		return iUserRepository.getUserById(id);
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.UserService#getUserByEmail(java.lang.String)
	*/
	
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return iUserRepository.getUserByEmail(email);
	}

}
