package entity;

import java.util.Scanner;

import utils.ScannerUtil;
import utils.Validate;

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
public class Employee extends User {
	private User user;
	private int idEmployee;
	private String projectName;
	private String proSkill;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	/**
	 * 
	 * Constructor for class Employee.
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 * @param idUser
	 * @param user
	 * @param idEmployee
	 * @param projectName
	 * @param proSkill
	 */
	public Employee(String firstName, String lastName, String phone, String email, String password, int idUser,
			User user, int idEmployee, String projectName, String proSkill) {
		super(firstName, lastName, phone, email, password, idUser);
		this.user = user;
		this.idEmployee = idEmployee;
		this.projectName = projectName;
		this.proSkill = proSkill;
	}

	/**
	 * 
	 * This method is used to input data
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @param user
	 */
	public void input(User user){
		Scanner scanner = new Scanner(System.in);
		this.user = user;
		System.out.println("ProjectName: ");
		projectName = Validate.readProjectName(scanner, "Please input data as String! \n Please input again: ");
		System.out.println("ProSkill: ");
		proSkill = ScannerUtil.readString(scanner, "Please input data as String! \n Please input again: ");
		
	}

}
