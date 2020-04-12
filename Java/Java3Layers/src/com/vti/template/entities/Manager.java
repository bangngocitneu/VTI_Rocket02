package com.vti.template.entities;

public class Manager extends User{

	private int expInYear;
	private int id;
	
	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = super.id;
	}
	
	
	

}
