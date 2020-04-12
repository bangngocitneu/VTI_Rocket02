/**
 * 
 */
package vti.com.Exam.backend.presentationLayer;

import vti.com.Exam.backend.businessLayer.UserService;
import vti.com.Exam.backend.businessLayer.UserServiceImplement;
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

public class UserController {
	private UserService service;
	public UserController(){
		service = new UserServiceImplement();
	}

	public boolean login(String userName, String password){
		return service.login(userName, password);
	}
	public boolean insertUser(User user){
		User u = service.getUserByEmail(user.getEmail());
		if(u!=null) {
			return false;
		}else {
			return service.insertUser(user);
		}
	}
	public User getUserByEmail(String email){
		return service.getUserByEmail(email);
		
	}
}
