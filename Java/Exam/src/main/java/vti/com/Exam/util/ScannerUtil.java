/**
 * 
 */
package vti.com.Exam.util;

import java.util.Scanner;

/**
 * This class is enter input from User
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Apr 12, 2020
 */

public class ScannerUtil {

	public static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String PATTERN_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{6,12}$";
	public static final String PATTERN_STRING = "[A-z0-9]{1,}";
	public static final String PATTERN_PHONE = "^[0-9]{9,12}$";
	public static final String PATTERN_PROJECTNAME_1 = "Testing System";
	public static final String PATTERN_PROJECTNAME_2 = "CRM";
	public static final String PATTERN_PROJECTNAME_3 = "TimeSheet";

	/**
	 * 
	 * This method show error message when validating
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param message
	 */
	private static void showError(String message) {
		System.out.println("Error :" + message);
	}

	/**
	 * 
	 * This method is . enter input Integer
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static int readInt(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method is . enter input double
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static double readDouble(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method is . enter input float
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static float readFloat(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	/**
	 * 
	 * This method is . enter input String
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readString(Scanner scanner,String errorMessage){
		while(true){
			try {
				String resrult = scanner.nextLine().trim();
				if(resrult != null & !resrult.isEmpty()){
					return resrult;
				}
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	/**
	 * 
	 * This method is . validate phone
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readPhone(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(PATTERN_PHONE )){
						return result;
					}else {
						System.out.println("Phone not true pattern! Try again");
					}
				}
			} catch(Exception e){
				showError(errorMessage);
			}
			
		}
	
}
	/**
	 * 
	 * This method is . validae email
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readEmail(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(PATTERN_EMAIL)){
						return result;
					}else {
						System.out.println("Email not true pattern! Try again");
					}
				}
			} catch(Exception e){
				showError(errorMessage);
			}
			
		}
	
}
	/**
	 * 
	 * This method is . validate projectname
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readProjectName(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(PATTERN_PROJECTNAME_1 )|| result.matches(PATTERN_PROJECTNAME_2 )||result.matches(PATTERN_PROJECTNAME_3 )){
						return result;
					}else {
						System.out.println("ProjectName must be Testing System or CRM or TimeSheet");
					}
				}
			} catch(Exception e){
				showError(errorMessage);
			}
			
		}

	}
	/**
	 * 
	 * This method is . validate password
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readPassword(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(PATTERN_PASSWORD)){
						return result;
					}else {
						System.out.println("Password not true pattern! Try again");
					}
				}
			} catch(Exception e){
				System.out.println("ErrorMessage!");
			}
			
		}

	}
}
