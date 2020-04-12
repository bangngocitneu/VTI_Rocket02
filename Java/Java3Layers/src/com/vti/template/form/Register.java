package com.vti.template.form;

import com.vti.template.entities.EnumProjectName;

public class Register {

	private int phone;
	private String email;
	private int expInYear;
	private EnumProjectName projectName;
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	public EnumProjectName getProjectName() {
		return projectName;
	}
	public void setProjectName(EnumProjectName projectName) {
		this.projectName = projectName;
	}
	
	
}
