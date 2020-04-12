/**
 * 
 */
package vti.com.Exam.backend.businessLayer;

import vti.com.Exam.backend.dataLayer.IManagerRepository;
import vti.com.Exam.backend.dataLayer.ManagerRepository;
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

public class ManagerServiceImplement implements ManagerService {
	private IManagerRepository imManagerRepository;
	public ManagerServiceImplement(){
		imManagerRepository = new ManagerRepository();
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.ManagerService#insertManager(vti.com.Exam.entity.Manager)
	*/
	
	public boolean insertManager(Manager mn) {
		// TODO Auto-generated method stub
		return imManagerRepository.insertManager(mn);
	}

}
