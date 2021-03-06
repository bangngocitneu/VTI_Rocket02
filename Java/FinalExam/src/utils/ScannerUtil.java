/**
 * 
 */
package utils;

import java.util.Scanner;

/**
 * 
 * This class is input from User
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 */
public class ScannerUtil {
	/**
	 * 
	 * This method show error message when validating
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 28, 2020
	 * @param message
	 */
private static void showError(String message){
	System.out.println("Error :" + message);
}
/**
 * 
 * This method is enter input Integer
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 28, 2020
 * @param scanner
 * @param ErrorMessage
 * @return
 */
public static int readInt(Scanner scanner,String errorMessage){
	while(true){
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			showError(errorMessage);
		}
	}
}
/**
 * 
 * This method is enter input double
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
public static double readDouble(Scanner scanner,String errorMessage){
	while(true){
		try {
			return Double.parseDouble(scanner.nextLine());
		} catch (Exception e) {
			showError(errorMessage);
		}
	}
}
/**
 * 
 * This method is enter input float
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
public static float readFloat(Scanner scanner,String errorMessage){
	while(true){
		try {
			return Float.parseFloat(scanner.nextLine());
		} catch (Exception e) {
			showError(errorMessage);
		}
	}
}
/**
 * 
 * This method is enter input String
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

}
