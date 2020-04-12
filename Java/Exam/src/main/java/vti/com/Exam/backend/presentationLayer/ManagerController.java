/**
 * 
 */
package vti.com.Exam.backend.presentationLayer;

import vti.com.Exam.backend.businessLayer.ManagerService;
import vti.com.Exam.backend.businessLayer.ManagerServiceImplement;
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

public class ManagerController {
	private ManagerService service;
	
	public ManagerController(){
		service = new ManagerServiceImplement();
	}
	public boolean insertManager(Manager mn){
		return service.insertManager(mn);
		
	}

}
