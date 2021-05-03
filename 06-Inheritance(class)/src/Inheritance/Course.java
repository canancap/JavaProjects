package Inheritance;

public class Course {
	public Course() {
	
	}
	public Course(int id,String name,int instructorId) {//overloading
		
		this.id=id;
		this.name=name;
		this.instructorId=instructorId;
	}
	int id;
	String name;
	int instructorId;
}
