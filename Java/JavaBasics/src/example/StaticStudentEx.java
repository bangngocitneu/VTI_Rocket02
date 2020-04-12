package example;

public class StaticStudentEx {
	  
		   int rollno;  
		   String name;  
		   static String college ="BachKhoa";  
		   
		 public StaticStudentEx(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}

		void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
			 StaticStudentEx s1 = new StaticStudentEx(111,"Hoang");  
			 StaticStudentEx s2 = new StaticStudentEx(222,"Thanh");  
		   
		 s1.display();  
		 s2.display();  
		  
		}  
}
