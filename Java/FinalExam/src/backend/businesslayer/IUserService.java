package backend.businesslayer;

import java.util.List;

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

public interface IUserService {
	/**
	 * 
	 * This method is get all User
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @return
	 */

	List<User> getAllUser();
	/**
	 * 
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean insertUsers(User user) throws Exception;
}
