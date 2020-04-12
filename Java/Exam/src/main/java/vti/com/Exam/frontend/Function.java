/**
 * 
 */
package vti.com.Exam.frontend;

import java.util.Scanner;

import vti.com.Exam.backend.presentationLayer.EmployeeController;
import vti.com.Exam.backend.presentationLayer.ManagerController;
import vti.com.Exam.backend.presentationLayer.UserController;
import vti.com.Exam.entity.Employee;
import vti.com.Exam.entity.Manager;
import vti.com.Exam.entity.User;
import vti.com.Exam.util.ScannerUtil;

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

public class Function {
	public void login(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("UserName: ");
		String username = ScannerUtil.readEmail(scanner, "error");
		System.out.println("Password: ");
		String password = ScannerUtil.readPassword(scanner, "error");
		boolean bl = new UserController().login(username, password);
		if(bl){
			System.out.println("Login successfully!");
		} else {
			System.out.println("Login Failed!");
		}
	}
	public void createManager(){
		User user = new User();
		Manager mn = new Manager();
		user.input();
		mn.input(user);
		boolean bl = new UserController().insertUser(user);
		if(bl){
			mn.setUser(new UserController().getUserByEmail(user.getEmail()));
			boolean bl1 = new ManagerController().insertManager(mn);
			if(bl1){
				System.out.println("Create Successfully!");
			} else {
				System.out.println("Create Manager Failed!");
			}
		}else {
			System.out.println("Create User Failed! Email existed!");
		}
	}
	public void createEmployee(){
		User user = new User();
		Employee empl = new Employee();
		user.input();
		empl.input(user);
		boolean bl = new UserController().insertUser(user);
		if(bl){
			empl.setUser(new UserController().getUserByEmail(user.getEmail()));
			boolean bl1 = new EmployeeController().insertEmployee(empl);
			if(bl1){
				System.out.println("Create Successfully!");
			}else {
				System.out.println("Create Employee Failed!");
			}
		}else {
			System.out.println("Create User Failed! Email existed!");
		}
	}

}
