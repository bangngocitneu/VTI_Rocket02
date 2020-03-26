package example;

public class Enumstest {

	 public static void main(String[] args) {
			Enums enums = new Enums();
		    enums.size = Enums.FreshJuiceSize.LARGE;
		    System.out.println(" FreshJuiceSize: " + enums.size);
		    System.out.println(" băng ngọc thích : " + Enums.FreshJuiceSize.MEDIUM);
		}
}
