package entity;

import java.util.Scanner;

import utils.ScannerUtil;

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
public class Manager extends User {
	private User user;
	private int idManager;
	private int expInYear;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getIdManager() {
		return idManager;
	}
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	/**
	 * 
	 * Constructor for class Manager.
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
	 * @param idManager
	 * @param expInYear
	 */
	public Manager(String firstName, String lastName, String phone, String email, String password, int idUser,
			User user, int idManager, int expInYear) {
		super(firstName, lastName, phone, email, password, idUser);
		this.user = user;
		this.idManager = idManager;
		this.expInYear = expInYear;
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
		do{
			System.out.println("ExpInYear: ");
			expInYear = ScannerUtil.readInt(scanner, "Please input data as Integer! \n Please input again: ");
			
		}while(expInYear > 20 || expInYear < 0);
	}


}
