package baitap.jdbc.student;

import java.util.List;
import java.util.Scanner;

import baitap.Student;

public class TestStudent {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ConnMySQL connMySQL = new ConnMySQL();
		String firstName = null;
		String lastName = null;
		String className = null;
		float mathScores = 0;
		float chemistryScores = 0;
		// String sqlInsert = "INSERT INTO student VALUES(?,?,?,?,?,?)";
		while (true) {
			System.out.println("-----MENU-----");
			System.out.println("1. Select ");
			System.out.println("2. Insert");
			System.out.println("Nhập lựa chọn");
			int choose = new Scanner(System.in).nextInt();
			switch (choose) {
			case 1:
				String selectALL = "select * from student";
				List<Student> student = connMySQL.query(selectALL);
				System.out.println(student);
				break;
			case 2:
				System.out.println("Enter fisrt name: ");
				firstName = new Scanner(System.in).nextLine();
				System.out.println("Enter last name: ");
				lastName = new Scanner(System.in).nextLine();
				System.out.println("Enter class name: ");
				className = new Scanner(System.in).nextLine();
				System.out.println("Enter math scorce: ");
				mathScores = new Scanner(System.in).nextFloat();
				System.out.println("Enter chemistry scores: ");
				chemistryScores = new Scanner(System.in).nextFloat();
				String sql = " INSERT INTO student(firstName,lastName,className,mathScores,chemistryScores) VALUES(?,?,?,?,?);";
				Integer id = connMySQL.insertRecords(firstName, lastName, className, mathScores, chemistryScores, sql);
				System.out.println(id);

			default:
				break;
			}
		}

	}

}
