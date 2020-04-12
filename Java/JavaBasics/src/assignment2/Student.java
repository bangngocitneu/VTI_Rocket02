package assignment2;

import java.time.LocalDate;

import assignment3.Point;


public class Student {

	String fullName;
	String id;
	LocalDate date;
	Point point;
	
	@Override
	public String toString() {
		return "Student [fullName: " + fullName + " Id : " + id + "Date: " + date + "Point: " + point + "]";
	}
	
	
}
