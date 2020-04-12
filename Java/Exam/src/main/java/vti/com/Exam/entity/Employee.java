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

public class Employee {
	private User uId;
	private int eId;
	private String projectName;
	private String proSkill;

	enum eProjectName {

		TestingSystem(1), CRM(2), TimeSheet(3);
		private int value;

		eProjectName(int i) {
			this.value = i;
		}

		public static eProjectName getEByIndex(int value) {
			for (eProjectName d : eProjectName.values()) {
				if (d.value == value) {
					return d;
				}
			}
			return null;
		}

		public static eProjectName getEByValue(int value) {
			for (eProjectName d : eProjectName.values()) {
				if (d.value == value) {
					return d;
				}
			}
			return null;
		}

	}

	public Employee() {
		super();
	}

	public Employee(int eId, String projectName, String proSkill) {
		super();
		this.eId = eId;
		this.projectName = projectName;
		this.proSkill = proSkill;
	}

	public User getUser() {
		return uId;
	}

	public void setUser(User uId) {
		this.uId = uId;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
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
	 * @param uId
	 */
	public void input(User uId) {
		Scanner scanner = new Scanner(System.in);
		this.uId = uId;
		System.out.println("ProjectName: ");
		projectName = ScannerUtil.readProjectName(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("ProSkill: ");
		proSkill = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
	}

}
