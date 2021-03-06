/**
 * 
 */
package utils;

import java.util.Scanner;

/**
 * 
 * This class is validate input data
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 */
public class Validate {

	public static final String VALIDATE_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String VALIDATE_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{6,12}$";
	public static final String VALIDATE_STRING = "[A-z0-9]{1,}";
	public static final String VALIDATE_PHONE = "^[0-9]{9,12}$";
	public static final String VALIDATE_PROJECTNAME_1 = "TestingSystem";
	public static final String VALIDATE_PROJECTNAME_2 = "CRM";
	public static final String VALIDATE_PROJECTNAME_3 = "TimeSheet";

/**
 * 
 * This method is . validate phone
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 * @param scanner
 * @param errorMessage
 * @return
 */
public static String readPhone(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(VALIDATE_PHONE)){
						return result;
					}else {
						System.out.println("Phone not true pattern! Try again");
					}
				}
			} catch(Exception e){
				System.out.println("ErrorMessage!");
			}
			
		}
	
}

	/**
	 * 
	 * This method is . validate Email
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */

public static String readEmail(Scanner scanner, String errorMessage){
		while(true){
			try{
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()){
					if(result.matches(VALIDATE_EMAIL)){
						return result;
					}else {
						System.out.println("Email not true pattern! Try again");
					}
				}
			} catch(Exception e){
				System.out.println("ErrorMessage!");
			}
			
		}
	
}

/**
 * 
 * This method is . validate ProjectName
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 * @param scanner
 * @param errorMessage
 * @return
 */

public static String readProjectName(Scanner scanner, String errorMessage){
	while(true){
		try{
			String result = scanner.nextLine().trim();
			if(result != null & !result.isEmpty()){
				if(result.matches(VALIDATE_PROJECTNAME_1 )|| result.matches(VALIDATE_PROJECTNAME_2 )||result.matches(VALIDATE_PROJECTNAME_3 )){
					return result;
				}else {
					System.out.println("ProjectName must be Testing System or CRM or TimeSheet");
				}
			}
		} catch(Exception e){
			System.out.println("ErrorMessage!");
		}
		
	}

}
/**
 * 
 * This method is . validate Password
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 * @param scanner
 * @param errorMessage
 * @return
 */
public static String readPassword(Scanner scanner, String errorMessage){
	while(true){
		try{
			String result = scanner.nextLine().trim();
			if(result != null & !result.isEmpty()){
				if(result.matches(VALIDATE_PASSWORD)){
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
