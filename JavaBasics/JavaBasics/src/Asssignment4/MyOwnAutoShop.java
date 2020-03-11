package asssignment4;

public class MyOwnAutoShop {

	public static void main(String[] args) throws ClassNotFoundException {

		double sale = 0;
		Sedan sedan = new Sedan(0, 3000, "red", 0, 21);
		sale = sedan.getSalePrice();
		System.out.println("Giá sale của sedan: " + sale);

		Ford ford, fd;
		ford = new Ford(200, 2000, "black", 0, 2019, 180);
		fd = new Ford(150, 1000, "grey", 0, 2020, 200);
		System.out.println("Giá sale của ford: " + ford.getSalePrice() + "\n" + "Giá sale của fd: " + fd.getSalePrice());

		Car car = new Car(100,3000,"yellow",300);
		sale = car.getSalePrice();
		System.out.println("Giá sale của car: " + sale);
	}

}
