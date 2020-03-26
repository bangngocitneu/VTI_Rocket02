package example;

public class TestString {

	public static void main(String[] args) {
		
		//charAt()
		String a = " abckndsa134";
		char x = a.charAt(3); //kq = k
		System.out.println(x);
		
		//indexOf()
		int y = a.indexOf("s"); // kq = 6
		int j = a.indexOf("ds"); // kq = 5
		int k = a.indexOf("a",2);// kq= 7
		System.out.println(y);
		System.out.println(j);
		System.out.println(k);
		
		// SubString
		String b = a.substring(2);
		System.out.println(b);    // kq = ckndsa134
		String c = a.substring(1,2);
		System.out.println(c);   // kq = b
		String d = a.substring(0,0);
		System.out.println(d);
		
		//trim()
		String e = a.trim();
		System.out.println(e);
		
		// replace
		String f = a.replace(a, "newChar");
		System.out.println(f);
		
		// startswith()
		
		System.out.println(a.startsWith("n"));
		
		// endswith()
		System.out.println(a.endsWith("4"));
		
		// split
		
		String g = "ab|cd|ef";
		String[] result = g.split("\\|");
		for (String h : result){
			System.out.println(h);
		}
		
		String i = "ab| cd| | |";
		System.out.println(i.split("\\|").length);
		System.out.println(i.split("\\|",-1).length);
	}
}
