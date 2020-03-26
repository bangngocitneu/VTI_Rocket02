package example;

public class LimitEX {

	  
		 static int a=40;//non static  
		   
		 public static void main(String args[]){  
		  System.out.println(a); // a phải là static mới in được do main là một phương thức static. mà phương thức static thì không sử dụng được thành phần dữ liệu Non - static 
		 }  
		  
}
