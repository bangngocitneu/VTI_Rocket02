package assignment2;

import java.time.LocalDate;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class StudentManagement {
	static String[] firstName = { "Nguyen", "Trinh", "Ngo", "Bui", "Le", "Vu", "Kieu" };
	static String[] middleName = { "Phuong", "Thanh", "Duy", "Manh", "Ngoc", "Huy", "Minh" };
	static String[] lastName = { "Trang", "Thao", "Khanh", "Quan", "Quyen", "Hung", "Tuan" };

	static Random random = new Random();

	static String[] fullNames = new String[10];
	static String[] ids = new String[10];
	static LocalDate[] dates = new LocalDate[10];
	public static void inputName() {
		// ho va ten sinh vien khong trung nhau
		
		
		

		for (int i = 0; i < fullNames.length;) {
			int indexFirstName = random.nextInt(7);
			int indexMiddleName = random.nextInt(7);
			int indexLastName = random.nextInt(7);

			String fullName = firstName[indexFirstName] + " " + middleName[indexMiddleName] + " "
					+ lastName[indexLastName];
			// kiem tra trung nhau
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (fullNames[j].equals(fullName)) {
					isUnique = true;
					break;
				}

			}
			if (isUnique) {

			} else {
				fullNames[i] = fullName;
				i++;
			}

		}
	}

	public static void inputId() {
		// ma sinh vien la duy nhat
		
		for (int i = 0; i < ids.length;) {
			String id = "SV" + RandomStringUtils.randomNumeric(7);
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (ids[j].equals(id)) {
					isUnique = true;
					break;
				}
			}
			if (isUnique) {

			} else {
				ids[i] = id;
				i++;
			}
		}
	}

	public static void inputBirthday() {
		// Ngay sinh cua sinh vien la duy nhat
		
		for (int i = 0; i < dates.length;) {
			int minDay = (int) LocalDate.of(1991, 02, 01).toEpochDay();
			int maxDay = (int) LocalDate.of(1991, 12, 31).toEpochDay();
			long randomDay = minDay + random.nextInt(maxDay - minDay);

			LocalDate date = LocalDate.ofEpochDay(randomDay);
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (dates[j].equals(date)) {
					isUnique = true;
					break;
				}
			}
			if (isUnique) {

			} else {
				dates[i] = date;
				i++;
			}
		}
	}

	public static void output() {                                                                                          

		// in ra bảng thông tin sinh viên gồm: Họ tên, id và ngày sinh.
		System.out.println("Câu 4: Thông tin sinh viên");
		System.out.println("      _______________________________________________________");
		System.out.format("       %-20s    %-15s %10s", "FullName", "ID", "Date Of Birth");
		System.out.println("\n      -------------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.format("       %-20s    %-15s %10s", fullNames[i], ids[i], dates[i]);
			System.out.println();

		}

	}



	public static void main(String[] args) { 
		
		inputName();
		inputId();
		inputBirthday();
		output();
		
			
}
}
