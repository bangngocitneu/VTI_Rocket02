package baitap;

import java.io.*;



public class Student implements Serializable {
	int id;
	String firstName;
	String lastName;
	String className;
	float mathScores;
	float chemistryScores;
	
	public Student(){
		
	}
	
	public Student(int id, String firstName, String lastName, String className, float mathScores,
			float chemistryScores) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.className = className;
		this.mathScores = mathScores;
		this.chemistryScores = chemistryScores;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public float getMathScores() {
		return mathScores;
	}
	public void setMathScores(float mathScores) {
		this.mathScores = mathScores;
	}
	public float getChemistryScores() {
		return chemistryScores;
	}
	public void setChemistryScores(float chemistryScores) {
		this.chemistryScores = chemistryScores;
	}
	@Override
	public String toString() {
		return "id: "+this.id+"|Full Name: "+this.firstName+" "+this.lastName+"|Class Name: "+this.className+"| MathScores: "+this.mathScores+"|ChemistryScores: "+this.chemistryScores+"\n";
	}
}
