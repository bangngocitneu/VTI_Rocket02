/**
 * 
 */
package vti.com.Exam.entity;

import java.util.Scanner;

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

public class User {

	protected int uId;
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;

	public User() {
		super();
	}

	public User(int uId, String firstName, String lastName, String phone, String email, String password) {
		super();
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

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

	/**
	 * 
	 * This method is . used to input data
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("FirstName:");
		firstName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("LastName:");
		lastName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Phone:");
		phone = ScannerUtil.readPhone(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Email:");
		email = ScannerUtil.readEmail(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Password:");
		password = ScannerUtil.readPassword(scanner, "Please input data as String! \nPlease input again: ");
	}
}
