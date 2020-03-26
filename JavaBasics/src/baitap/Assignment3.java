package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import org.apache.commons.lang3.RandomStringUtils;

public class Assignment3 extends Assignment2 {

	public static void nhap() {
		float RA, SD, CP, CUT, FMT;
		List<Float> listRA = new ArrayList<>();
		List<Float> listSD = new ArrayList<>();
		List<Float> listCP = new ArrayList<>();
		List<Float> listCUT = new ArrayList<>();
		List<Float> listFMT = new ArrayList<>();

		Random rd = new Random();

		for (int i = 0; i < 10;i++) {
			Float diem = rand(0, 10);
			if (diem >= 8 && diem <= 10) {
				listRA.add(diem);
			} else if (diem >= 5 && diem <= 7) {
				listRA.add(diem);
			} else if (diem >= 3 && diem <= 4) {
				listRA.add(diem);
			} else if (diem == 1 || diem == 2) {
				listRA.add(diem);
			} else if (diem == 0) {
				listRA.add(diem);
			}
		}
		for (Float diem : listRA) {
			System.out.println(diem + "\n");
		}
	}

	public static float rand(float start, float end) {
		return start + (float) Math.round(Math.random() * (end - start));
	}

	/*
	 * public static int randBetween(int start, int end) { return start + (int)
	 * Math.round(Math.random() * (end - start)); } public static void
	 * main(String[] args) {
	 * 
	 * System.out.println("Assignment 2"); System.out.println(
	 * "Cau1: Ho ten day du la:");
	 * 
	 * String[] firstname = new String[7]; firstname[0] = "Nguyen"; firstname[1]
	 * = "Trinh"; firstname[2] = "Le"; firstname[3] = "Phan"; firstname[4] =
	 * "Vu"; firstname[5] = "Mai"; firstname[6] = "Duong";
	 * 
	 * String[] middletname = new String[7]; middletname[0] = "Thi";
	 * middletname[1] = "Van"; middletname[2] = "Xuan"; middletname[3] =
	 * "Thanh"; middletname[4] = "Quoc"; middletname[5] = "Viet"; middletname[6]
	 * = "Ngoc";
	 * 
	 * String[] lasttname = new String[7]; lasttname[0] = "Hung"; lasttname[1] =
	 * "Duy"; lasttname[2] = "Hoa"; lasttname[3] = "Hong"; lasttname[4] =
	 * "Tuan"; lasttname[5] = "Kien"; lasttname[6] = "Nghia";
	 * 
	 * String[] fullname = new String[10]; Random rd = new Random();
	 * 
	 * for (int i = 0; i < 10; i++) { int rdfirstname =
	 * rd.nextInt(firstname.length); int rdmiddlename =
	 * rd.nextInt(middletname.length); int rdlastname =
	 * rd.nextInt(lasttname.length); fullname[i] = firstname[rdfirstname] + " "
	 * + middletname[rdmiddlename] + " " + lasttname[rdlastname];
	 * System.out.println(fullname[i]); }
	 * 
	 * System.out.println("Câu 2 mỗi mã SV có thể trùng");
	 * 
	 * for (int i = 0; i < 10; i++) { System.out.println("ID của SV thứ " + (i +
	 * 1) + ": " + "SV" + RandomStringUtils.randomNumeric(7)); }
	 * 
	 * System.out.println("Câu 2 mỗi mã SV là duy nhất!"); Vector v = new
	 * Vector(); String[] Id = new String[10]; for (int i = 0; i < 10;) { Id[i]
	 * = "SV" + RandomStringUtils.randomNumeric(7); System.out.println(
	 * "ID của SV thứ " + (i + 1) + ": " + Id[i] ); if (!v.contains(Id[i])) {
	 * i++; v.add(Id);
	 * 
	 * }
	 * 
	 * } System.out.println("Câu 3: Ngày sinh của mỗi sinh viên là duy nhất!");
	 * 
	 * String[] DOB = new String[10]; for (int i = 0; i < 10;) { DOB[i] =
	 * (String) (1991 + "/" + randBetween(02, 12) + "/" + randBetween(01, 31));
	 * System.out.println("Ngày sinh của SV " + (i + 1) + ": " + DOB[i]); if
	 * (!v.contains(DOB[i])) { i++; v.add(DOB); } }
	 * 
	 * System.out.println("Câu 4: Thông tin sinh viên"); System.out.println(
	 * "|    ID       |     FullName           |      BirthDate      |"); for
	 * (int i = 0; i < 10; i++) { System.out.println("   "+Id[i]+ "     "
	 * +fullname[i]+"               "+DOB[i]+"      "); //System.out.println(
	 * "ID: " + Id[i] + "| " + "FullName: " + fullname[i] + "| " + "BirthDate: "
	 * + DOB[i] + "\n"); }
	 * 
	 * 
	 * 
	 * System.out.println("Assignment 3"); Random rand = new Random(); float[]
	 * RA = new float[10]; float[] SD = new float[10]; float[] CP = new
	 * float[10]; float[] CUT = new float[10]; float[] FMT = new float[10];
	 * float[] AVG = new float[10];
	 * 
	 * for (int i = 0; i < 10; i++) { if (i == 0) { int ind = rand.nextInt(2) +
	 * 8; if (ind < 10) { RA[i] = ind + 1; SD[i] = ind; CP[i] = ind + 1; CUT[i]
	 * = ind + 1; FMT[i] = ind; } else { RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i]
	 * = ind; } }
	 * 
	 * else if (i <= 3) { int ind = rand.nextInt(2) + 5; if (ind < 7) { RA[i] =
	 * ind + 1; SD[i] = ind; CP[i] = ind + 1; CUT[i] = ind + 1; FMT[i] = ind; }
	 * else { RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = ind; }
	 * 
	 * } else if (i <= 6) { int ind = rand.nextInt(1) + 3; if (ind < 4) { RA[i]
	 * = ind + 1; SD[i] = ind; CP[i] = ind + 1; CUT[i] = ind + 1; FMT[i] = ind;
	 * } else { RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = ind; }
	 * 
	 * } else if (i <= 8) { int ind = rand.nextInt(1) + 1; if (ind < 2) { RA[i]
	 * = ind + 1; SD[i] = ind; CP[i] = ind + 1; CUT[i] = ind + 1; FMT[i] = ind;
	 * } else { RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = ind; }
	 * 
	 * } else { RA[i] = 0; SD[i] = 0; CP[i] = 0; CUT[i] = 0; FMT[i] = 0; }
	 * 
	 * } // Sap xep lai mang cac diem
	 * 
	 * for (int j = 0; j < 10; j++) { int index1 = rand.nextInt(10); int index2
	 * = rand.nextInt(10); int index3 = rand.nextInt(10); int index4 =
	 * rand.nextInt(10); int index5 = rand.nextInt(10); float a = RA[j]; RA[j] =
	 * RA[index1]; RA[index1] = a;
	 * 
	 * float b = SD[j]; SD[j] = SD[index2]; SD[index2] = b;
	 * 
	 * float c = CP[j]; CP[j] = CP[index3]; CP[index3] = c;
	 * 
	 * float d = CUT[j]; CUT[j] = CUT[index4]; CUT[index4] = d;
	 * 
	 * float e = FMT[j]; FMT[j] = FMT[index5]; FMT[index5] = e; AVG[j] = (RA[j]
	 * + SD[j] + CP[j] + CUT[j] + FMT[j]) / 5; }
	 * 
	 * // Sx diem trung binh theo thu tu giam dan
	 * 
	 * float temp = AVG[0]; for (int i = 0; i < 9; i++) { for (int j = i + 1; j
	 * < 10; j++) { if (AVG[i] < AVG[j]) { temp = AVG[j]; AVG[j] = AVG[i];
	 * AVG[i] = temp; } } } // In ra man hinh
	 * 
	 * System.out.println(
	 * "                                        THÔNG TIN SINH VIÊN ");
	 * System.out.println(
	 * "====================================================================================================================="
	 * ); System.out.println("Full Name" + "		 " + "ID  " + "	   	       "
	 * + "Ngay sinh" + "	 " + "RA" + "	" + "SD" + "	" + "CP" + "	" +
	 * "CUT" + "	" + "FMT" + "	" + "TB"); System.out.println(
	 * "====================================================================================================================="
	 * ); for (int i = 0; i < 10; i++) { System.out.println(fullname[i] +
	 * "		" + Id[i] + "		" + DOB[i] + "	" + RA[i] + "	" + SD[i] +
	 * "	" + CP[i] + "	" + CUT[i] + "	" + FMT[i] + "	" + AVG[i]);
	 * 
	 * } }
	 */
}
