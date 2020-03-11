package assignment3;

import java.time.LocalDate;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import baitap.Student;

public class PointManagement {

	static String[] firstName = { "Nguyen", "Trinh", "Ngo", "Bui", "Le", "Vu", "Kieu" };
	static String[] middleName = { "Phuong", "Thanh", "Duy", "Manh", "Ngoc", "Huy", "Minh" };
	static String[] lastName = { "Trang", "Thao", "Khanh", "Quan", "Quyen", "Hung", "Tuan" };

	static Random random = new Random();

	static String[] fullNames = new String[10];
	static String[] ids = new String[10];
	static LocalDate[] dates = new LocalDate[10];

	static int[] RAs = create10PointsForOneSubject();
	static int[] SDs = create10PointsForOneSubject();
	static int[] CPs = create10PointsForOneSubject();
	static int[] CUTs = create10PointsForOneSubject();
	static int[] FMTs = create10PointsForOneSubject();
	static double[] AVGs = new double[10];

	public static void inputName() {
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
	static int[] create10PointsForOneSubject() {
		Random random = new Random();
		int[] points = new int[10];

		int x = random.nextInt(10 - 8 + 1) + 8;
		points[0] = x;

		for (int i = 1; i < 4; i++) {
			x = random.nextInt(7 - 5 + 1) + 5;
			points[i] = x;
		}

		for (int i = 4; i < 7; i++) {
			x = random.nextInt(4 - 3 + 1) + 3;
			points[i] = x;
		}

		for (int i = 7; i < 9; i++) {
			x = random.nextInt(2 - 1 + 1) + 1;
			points[i] = x;
		}

		points[9] = 0;

		int[] randomIndexPoints = new int[10];
		for (int i = 0; i < points.length; i++) {
			int rd = random.nextInt(points.length - 1);

			points = swap(points, rd, points.length - 1);
			// printPoints(points);
		}
		return points;

	}
	static Point[] create10points() {
		Point[] points = new Point[10];

		for (int i = 0; i < points.length; i++) {
			Point point = new Point();
			point.RA = RAs[i];
			point.SD = SDs[i];
			point.CP = CPs[i];
			point.CUT = CUTs[i];
			point.FMT = FMTs[i];
			AVGs[i] = ((RAs[i] + SDs[i] + CPs[i] + CUTs[i] + FMTs[i]) / 5d);
			point.AVG = AVGs[i];
			points[i] = point;
		}
		double temp = AVGs[0];
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (AVGs[i] < AVGs[j]) {
					temp = AVGs[j];
					AVGs[j] = AVGs[i];
					AVGs[i] = temp;
				} else if(AVGs[i] == AVGs[j]){
					// sắp xếp theo môn điểm cao nhất
				}
			}
		}
		return points;
	}

	static int[] swap(int[] points, int index1, int index2) {
		int t = points[index1];
		points[index1] = points[index2];
		points[index2] = t;
		return points;
	}


	public static void output() {

		System.out.println("Câu 4: Thông tin sinh viên");
		System.out.println(
				"      _____________________________________________________________________________________________________________________");
		System.out.format("       %-20s    %-15s %10s %8s %8s %10s %10s %10s %10s", "FullName", "ID", "Date Of Birth",
				"RA", "SD", "CP", "CUT", "FMT", "AVG");
		System.out.println(
				"\n      ---------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.format("       %-20s    %-15s %10s %10s %10s %10s %10s %10s %10s", fullNames[i], ids[i],
					dates[i], (RAs[i]), SDs[i], CPs[i], CUTs[i], FMTs[i], AVGs[i]);
			System.out.println();

		}

	}

	public static void main(String[] args) {

		inputName();
		inputId();
		inputBirthday();
		create10PointsForOneSubject();
		create10points();
		output();
	}

}