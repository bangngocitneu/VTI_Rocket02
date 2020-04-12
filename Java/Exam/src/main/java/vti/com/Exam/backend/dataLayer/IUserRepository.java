/**
 * 
 */
package vti.com.Exam.backend.dataLayer;

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

public interface IUserRepository {

	boolean login(String userName, String password);
	boolean insertUser(User user);
	boolean getUserById(int id);
	User getUserByEmail(String email);
}
