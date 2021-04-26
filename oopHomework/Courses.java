package oopHomework;

public class Courses {
	
	public Courses() {
		System.out.println("Constructor");
	}
	
	public Courses(int id, String name, String instructor) {
		
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		
	}
	
	int id;
	String name;
	String instructor;
	
}
