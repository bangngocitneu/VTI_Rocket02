package asssignment4;

public  class Car {

	protected int speed;
	protected double regularPrice;
	protected String color;
	protected double SalePrice;

	public Car(int speed, double regularPrice, String color, double salePrice) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		SalePrice = salePrice;
	}

	
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public double getRegularPrice() {
		return regularPrice;
	}


	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setSalePrice(double salePrice) {
		SalePrice = salePrice;
	}


	public double getSalePrice() {
		return SalePrice;
	}

}
