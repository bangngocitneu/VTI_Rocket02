package example;

public class StudentChange {

	     int rollno;  
	     String name;  
	     static String college = "BachKhoa";  
	       
	     static void change(){  
	     college = "Yêu Trường";  
	     }  
	  
	     StudentChange(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    	StudentChange.change();  
	  
	    	StudentChange s1 = new StudentChange (111,"Hoang");  
	    	StudentChange s2 = new StudentChange (222,"Thanh");  
	    	StudentChange s3 = new StudentChange (333,"Nam");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	   }  
}   

