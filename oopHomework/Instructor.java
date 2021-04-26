package oopHomework;

public class Instructor {
	
	public Instructor() {
		
		System.out.println("Constructor");
	}
	
	public Instructor(int indtId, String firstLastName, String information) {
		
		this.intId = indtId;
		this.firstLastName = firstLastName;
		this.information = information;
	}
	
	int intId;
	String firstLastName;
	String information;
	
}
