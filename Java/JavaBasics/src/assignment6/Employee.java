package assignment6;

public class Employee {

	protected String fullName;
	protected static float salaryMultiplier;
	protected static float salary;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getSalaryMultiplier() {
		return salaryMultiplier;
	}

	public void setSalaryMultiplier(float salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}

	
	public static float getSalary() {
		return getSalary();
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(String fullName, float salaryMultiplier, float salary) {
		super();
		this.fullName = fullName;
		this.salaryMultiplier = salaryMultiplier;
		this.salary = salary;
	}

}
