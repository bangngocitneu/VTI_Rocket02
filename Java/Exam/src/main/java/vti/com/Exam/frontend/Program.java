/**
 * 
 */
package vti.com.Exam.frontend;

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

public class Program {
	/**
	 * 
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param args
	 */
	public static void main(String[] args) {
		Function function = new Function();
		Scanner scanner = new Scanner(System.in);
		int choose;
		int choose1;
		while(true){
			System.out.println("--------- Please Choose ---------");
			System.out.println("1.Register");
			System.out.println("2.Login");
			choose = ScannerUtil.readInt(scanner, "Please input data as INTEGER! \nPlease input again: ");
			switch(choose){
			case 1:
				boolean bl = true;
				while (bl){
					System.out.println("1.Manager");
					System.out.println("2.Employee");
					System.out.println("1.Back");
					choose1 = ScannerUtil.readInt(scanner, "Please input data as INTEGER! \nPlease input again: ");
					if (choose1 == 1){
						function.createManager();
					} else if (choose1 == 2){
						function.createEmployee();
					} else if (choose1 == 3){
						bl = false;
					} else {
						System.out.println("Please choose 1 or 2 or 3");
					}
					break;
				}
				break;
			case 2:
				function.login();
				break;
			default:
				System.out.println(" Please choose 1 or 2");
				break;
			}
		}
	}
}
