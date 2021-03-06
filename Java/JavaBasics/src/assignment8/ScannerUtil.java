package assignment8;

import java.util.Scanner;
/**
 * 
 * This class is enter input from user
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Mar 31, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Mar 31, 2020
 */
public class ScannerUtil {

	/**
	 * 
	 * This method is enter input Integer
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return int - a number from user input
	 */
	public static int readInt(Scanner scanner,String errorMessage){
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
	 * This method is enter input Double
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return double - a number from user input
	 */
	public static double readDouble(Scanner scanner,String errorMessage){
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
	 * This method is enter input Float
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return float - a number from user input
	 */
	public static float readFloat(Scanner scanner,String errorMessage){
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
	 * This method is enter input string 
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readString(Scanner scanner,String errorMessage){
		while (true) {
			try {
				String result = scanner.nextLine().trim();
				if(result != null && !result.isEmpty()){
					return result;
				}
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	

	/**
	 * 
	 * This method is show errorMessage
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Mar 31, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Mar 31, 2020
	 * @param errorMessage
	 */
	private static void showError(String errorMessage) {
		System.out.println("Error: " + errorMessage);
		
	}
}
