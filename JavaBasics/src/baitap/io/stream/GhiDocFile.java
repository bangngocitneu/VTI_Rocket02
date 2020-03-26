package baitap.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiDocFile {

	public static void main(String[] args) throws IOException{

		File file = new File("demo.txt");
		if(!file.exists()){
			file.createNewFile();
		}

		FileInputStream fileInputStream = new FileInputStream(file);
		int c = 0;
		while(c != -1){
			System.out.print((char) c);
			c=fileInputStream.read();	
		}
		fileInputStream.close();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String s = "hello";
		fileOutputStream.write(s.getBytes());
		fileOutputStream.close();

		
		
	}
}
