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

public class Manager {
	private User uId;
	private int mId;
	private int expInYear;
	
	public Manager(){
		super();
	}

	public Manager(int mId, int expInYear) {
		super();
		this.mId = mId;
		this.expInYear = expInYear;
	}

	public User getUser() {
		return uId;
	}

	public void setUser(User uId) {
		this.uId = uId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	/**
	 * 
	 * This method is .used to input data 
	 * 
	 * @Description: .
	 * @author: NNgoc
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: NNgoc
	 * @modifer_date: Apr 12, 2020
	 * @param uId
	 */
	public void input(User uId){
		Scanner scanner = new Scanner(System.in);
		this.uId = uId;
		do{
			System.out.println("ExpInYear: ");
			expInYear = ScannerUtil.readInt(scanner, "Please input data as Integer! \n Please input again: ");
			
		}while(expInYear > 20 || expInYear < 0);
	}
	
}