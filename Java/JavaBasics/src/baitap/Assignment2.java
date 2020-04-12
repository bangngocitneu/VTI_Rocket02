package baitap;

import java.util.Random;
import java.util.Vector;
import org.apache.commons.lang3.RandomStringUtils;

public class Assignment2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		System.out.println("Cau1: Ho ten day du la:");

		String[] firstname = new String[7];
		firstname[0] = "Nguyen";
		firstname[1] = "Trinh";
		firstname[2] = "Le";
		firstname[3] = "Phan";
		firstname[4] = "Vu";
		firstname[5] = "Mai";
		firstname[6] = "Duong";

		String[] middletname = new String[7];
		middletname[0] = "Thi";
		middletname[1] = "Van";
		middletname[2] = "Xuan";
		middletname[3] = "Thanh";
		middletname[4] = "Quoc";
		middletname[5] = "Viet";
		middletname[6] = "Ngoc";

		String[] lasttname = new String[7];
		lasttname[0] = "Hung";
		lasttname[1] = "Duy";
		lasttname[2] = "Hoa";
		lasttname[3] = "Hong";
		lasttname[4] = "Tuan";
		lasttname[5] = "Kien";
		lasttname[6] = "Nghia";

		String[] fullname = new String[10];
		Random rd = new Random();

		for (int i = 0; i < 10; i++) {
			int rdfirstname = rd.nextInt(firstname.length);
			int rdmiddlename = rd.nextInt(middletname.length);
			int rdlastname = rd.nextInt(lasttname.length);
			fullname[i] = firstname[rdfirstname] + " " + middletname[rdmiddlename] + " " + lasttname[rdlastname];
			System.out.println(fullname[i]);
		}

		/*System.out.println("Câu 2 mỗi mã SV có thể trùng");

		for (int i = 0; i < 10; i++) {
			System.out.println("ID của SV thứ " + (i + 1) + ": " + "SV" + RandomStringUtils.randomNumeric(7));
		}*/

		System.out.println("Câu 2 mỗi mã SV là duy nhất!");
		Vector v = new Vector();
		String[] Id = new String[10];
		for (int i = 0; i < 10;) {
			Id[i] = "SV" + RandomStringUtils.randomNumeric(7);
			System.out.println("ID của SV thứ " + (i + 1) + ": " + Id[i] );
			if (!v.contains(Id[i])) {
				i++;
				v.add(Id);

			}

		}
		System.out.println("Câu 3: Ngày sinh của mỗi sinh viên là duy nhất!");

		String[] DOB = new String[10];
		for (int i = 0; i < 10;) {
			DOB[i] = (String) (1991 + "/" + randBetween(02, 12) + "/" + randBetween(01, 31));
			System.out.println("Ngày sinh của SV " + (i + 1) + ": " + DOB[i]);
			if (!v.contains(DOB[i])) {
				i++;
				v.add(DOB);
			}
		}

		System.out.println("Câu 4: Thông tin sinh viên");
		System.out.println("|    ID       |     FullName           |      BirthDate      |");
		for (int i = 0; i < 10; i++) {
		System.out.println("   "+Id[i]+ "     "+fullname[i]+"               "+DOB[i]+"      ");
			//System.out.println("ID: " + Id[i] + "| " + "FullName: " + fullname[i] + "| " + "BirthDate: " + DOB[i] + "\n");
		}

	}

	public static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
	

}