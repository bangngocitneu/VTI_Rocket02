package asssignment4;

public class Ford extends Car {



	public Ford(int speed, double regularPrice, String color, double salePrice, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color, salePrice);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	private int year;
	private int manufacturerDiscount;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {

		SalePrice = regularPrice - manufacturerDiscount;
		return SalePrice;
	}

}
