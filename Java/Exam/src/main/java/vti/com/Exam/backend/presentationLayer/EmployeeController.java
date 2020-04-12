/**
 * 
 */
package vti.com.Exam.backend.presentationLayer;

import vti.com.Exam.backend.businessLayer.EmployeeService;
import vti.com.Exam.backend.businessLayer.EmployeeServiceImplement;
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

public class EmployeeController {

	private EmployeeService service;
	public EmployeeController(){
		service = new EmployeeServiceImplement();
	}
	public boolean insertEmployee(Employee empl){
		return service.insertEmployee(empl);
		
	}
}
