package baitap;

import java.util.ArrayList;
import java.util.Scanner;

import baitap.io.stream.TestSerializable;

public class QuanLiHocSinh extends Student  {
	static ArrayList<Student> dsHocSinh = new ArrayList<Student>();

	
	public static void menu()
	{
		System.out.println("---------Menu------------");
		System.out.println("1. Nhập thông tin học sinh");
		System.out.println("2. Xuất thông tin học sinh");
		System.out.println("3. Ghi file");
		System.out.println("4. Đọc file");
		System.out.println("5. Thoat");
		System.out.println("Mời bạn nhập lựa chọn");
		String choose = new Scanner(System.in).nextLine();
		switch (choose) {
		case "nhap":
			nhap();
			break;
		case "xuat":
			xuat();
			break;
		case "ghi":
			ghi();
			break;
		case "doc":
			doc();
			break;
		case "thoat":
			System.out.println("bye bye");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	private static void doc() {
		dsHocSinh=TestSerializable.docFile("student.dat");
		xuat();
	}

	private static void ghi() {
		if(TestSerializable.ghiFile(dsHocSinh, "student.dat")==true)
		{
			System.out.println("Lưu file thành công");
		}
		else
		{
			System.out.println("Lưu file thất bại");
		}
	}

	public static void main(String[] args) {

		/*Student student = new Student();

		File file = new File("student.dat");
		if (!file.exists()) {

		}*/
		while(true)
		{
			menu();
		}
		
	}

	private static void nhap() {
		System.out.println("Nhap vao id:");
		int id = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao Ho:");
		String firstName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao Ten:");
		String lastName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao Lop:");
		String className = new Scanner(System.in).nextLine();
		System.out.println("nhap vao diem toan:");
		float mathScores = new Scanner(System.in).nextFloat();
		System.out.println("Nhap vao diem hoa:");
		float chemistryScores = new Scanner(System.in).nextFloat();

		dsHocSinh.add(new Student(id, firstName, lastName, className, mathScores, chemistryScores));
	}

	private static void xuat() {
		for(Student ql:dsHocSinh)
		{
			System.out.println(ql);
		}
	}

}
