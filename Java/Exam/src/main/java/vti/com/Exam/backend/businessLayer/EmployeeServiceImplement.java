/**
 * 
 */
package vti.com.Exam.backend.businessLayer;

import vti.com.Exam.backend.dataLayer.EmployeeRepository;
import vti.com.Exam.backend.dataLayer.IEmployeeRepository;
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

public class EmployeeServiceImplement implements EmployeeService {
	private IEmployeeRepository ieEmployeeRepository;
	public EmployeeServiceImplement(){
		ieEmployeeRepository = new EmployeeRepository();
	}

	/* 
	* @see vti.com.Exam.backend.businessLayer.EmployeeService#insertEmployee(vti.com.Exam.entity.Employee)
	*/
	
	public boolean insertEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return ieEmployeeRepository.insertEmployee(empl);
	}

	
}
