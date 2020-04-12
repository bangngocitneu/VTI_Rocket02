package entity;

import java.util.Scanner;

import utils.ScannerUtil;
import utils.Validate;

/**
 * 
 * This class is User
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 27, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 27, 2020
 */

public class User {
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;
	protected int idUser;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

/**
 * 
 * Constructor for class User.
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
 */
	public User(String firstName, String lastName, String phone, String email, String password, int idUser) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.idUser = idUser;
	}
	public User(){
		
	}
	/**
	 * 
	 * This method is used input data
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 */
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("FirstName:");
		firstName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again:");
		System.out.println("LastName:");
		lastName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again:");
		System.out.println("Phone:");
		phone = Validate.readPhone(scanner,"Please input data as String! \nPlease input again:" );
		System.out.println("Email:");
		email = Validate.readEmail(scanner,"Please input data as String! \nPlease input again:" );
		System.out.println("Password:");
		password = Validate.readPassword(scanner, "Please input data as String! \nPlease input again:" );
		
	}


	
	
	
	

	

	
}
