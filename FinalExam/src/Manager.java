
public class Manager extends User {
	private int ExpInYear;

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public Manager(String firstName, String lastName, int phone, String email, int expInYear) {
		super(firstName, lastName, phone, email);
		ExpInYear = expInYear;
	}
	

}