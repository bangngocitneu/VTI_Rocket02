package asssignment4;

public class Truck extends Car {

	public Truck(int speed, double regularPrice, String color, double salePrice, int weight) {
		super(speed, regularPrice, color, salePrice);
		this.weight = weight;
	}

	private int weight;

	public double getSalePrice() {
		if (weight > 2000) {
			SalePrice = 0.9 * regularPrice;
		} else {
			SalePrice = 0.8 * regularPrice;
		}
		return SalePrice;
	}
}
