package com.vti.template.entities;

public class Employee extends User{

	private  EnumProjectName projectName; 
	private String proSkil;		
	private int id;
	public EnumProjectName getProjectName() {
		return projectName;
	}
	public void setProjectName(EnumProjectName projectName) {
		this.projectName = projectName;
	}
	public String getProSkil() {
		return proSkil;
	}
	public void setProSkil(String proSkil) {
		this.proSkil = proSkil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = super.id;
	} 			

	
}
