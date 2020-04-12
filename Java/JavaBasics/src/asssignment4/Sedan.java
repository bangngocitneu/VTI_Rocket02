package asssignment4;

public class Sedan extends Car {

	public Sedan(int speed, double regularPrice, String color, double salePrice, int length) {
		super(speed, regularPrice, color, salePrice);
		this.length = length;
	}

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getSalePrice() {

		if (length > 20) {
			SalePrice = 0.95 * regularPrice;
		} else {
			SalePrice = 0.9 * regularPrice;
		}
		return SalePrice;
	}
}
