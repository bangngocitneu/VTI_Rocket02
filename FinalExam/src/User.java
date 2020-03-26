
public class User {
	protected String FirstName;
	protected String LastName;
	protected int    Phone;
	protected String Email;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public User(String firstName, String lastName, int phone, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
		Email = email;
	}
	
}