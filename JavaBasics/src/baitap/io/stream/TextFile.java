package baitap.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import baitap.Student;

public class TextFile {
	
	public static boolean ghiFile(ArrayList<Student> dsHocSinh, String path)
	{
		try {
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=new OutputStreamWriter(fos);
			BufferedWriter bw=new BufferedWriter(osw);
			for(Student st:dsHocSinh)
			{
				String line=
						st.getId()+";"+
						st.getFirstName()+";"+
						st.getLastName()+";"+
						st.getClassName()+";"+
						st.getMathScores()+";"+
						st.getChemistryScores();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Student> docFile(String path)
	{
		ArrayList<Student> dsHocSinh=new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null)
			{
				String[] arr=line.split("\\;");
				if(arr.length>0)
				{
					Student student=new Student();
					student.setId(Integer.parseInt(arr[0]));
					student.setFirstName(arr[1]);
					student.setLastName(arr[2]);
					student.setClassName(arr[3]);
					student.setMathScores(Float.parseFloat(arr[4]));
					student.setChemistryScores(Float.parseFloat(arr[5]));
					dsHocSinh.add(student);
				}
				line=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception  e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
