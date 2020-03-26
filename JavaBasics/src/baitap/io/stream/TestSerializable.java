package baitap.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import baitap.Student;

public class TestSerializable {

	public static boolean ghiFile(ArrayList<Student> dsHocSinh, String path) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dsHocSinh);

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static ArrayList<Student> docFile(String path) {
		ArrayList<Student> dsHocSinh = new ArrayList<>();
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			 fis = new FileInputStream(path);
			 ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsHocSinh = (ArrayList<Student>) data;
			ois.close();
			fis.close();
			return dsHocSinh;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

}
