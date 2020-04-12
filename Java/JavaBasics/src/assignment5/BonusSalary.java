package assignment5;

abstract class Employee {

	private String name, address;
	protected int basicSalary,bonusSalary, salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public int getBonusSalary() {
		return bonusSalary;
	}
	public void setBonusSalary(int bonusSalary) {
		this.bonusSalary = bonusSalary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public abstract int getMonthlySalary();
	
}
class NormalEmployee extends BonusSalary{

	@Override
	public int getMonthlySalary() {
		salary = basicSalary;
		return salary;
	}
	
}
public class BonusSalary extends Employee{

	@Override
	public int getMonthlySalary() {
		salary = basicSalary + bonusSalary;
		return salary;
	}
	
}
