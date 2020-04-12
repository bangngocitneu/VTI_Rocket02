package com.vti.template.util;

import java.util.Scanner;

/**
 * 
 * This class is . nhập dữ liệu sai thì cho phép nhập lại
 * 
 * @Description: .
 * @author: NNgoc
 * @create_date: Apr 4, 2020
 * @version: 1.0
 * @modifer: NNgoc
 * @modifer_date: Apr 4, 2020
 */
public class ScannerUtil {

	/**
	 * 
	 * This method is . validate nhập int 
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 4, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 4, 2020
	 * @param scanner
	 * @return
	 */
	public static int readInt(Scanner scanner){
		while(true){
			try{
				return Integer.parseInt(scanner.nextLine());
			}catch(Exception e){
				System.out.println(Constant.ERROR_VALIDATE_INT);
			}
		}
	}
	/**
	 * 
	 * This method is . validate input double
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 4, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 4, 2020
	 * @param scanner
	 * @return
	 */
	
	public static double readDouble( Scanner scanner){
		while(true){
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_DOUBLE);
			}
		}
	}
	/**
	 * 
	 * This method is . validate nhập float
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 4, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 4, 2020
	 * @param scanner
	 * @return
	 */
	public static float readFloat( Scanner scanner){
		while(true){
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_FLOAT);
			}
		}
	}
	public static String readString Scanner scanner){
		while(true){
			try {
				String result = scanner.nextLine().trim();
				if(result != null && !result.isEmpty()){
					return result;
				}
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_STRING);
			}
		}
	}
}
