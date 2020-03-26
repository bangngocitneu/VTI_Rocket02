package example;

public class StaticCounterEX {
 
		static int count=0; //se lay bo nho (memory) khi bien instance duoc tao  
		 //Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong 
		StaticCounterEX(){  
		count++;  
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		  
		StaticCounterEX c1=new StaticCounterEX();  
		StaticCounterEX c2=new StaticCounterEX();  
		StaticCounterEX c3=new StaticCounterEX();  
		  
		 
		}  
}
