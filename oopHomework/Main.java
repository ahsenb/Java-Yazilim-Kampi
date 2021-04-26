package oopHomework;

public class Main {
	
	public static void main(String[] args) {
		
		Courses course1 = new Courses(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)","Engin Demiroğ");
		Courses course2 = new Courses(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demiroğ");
		Courses course3 = new Courses(3,"Programlamaya Giriş için Temel Kurs","Engin Demiroğ");
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ", "MCT, PMP, ITIL");
		
		Courses[] courses = {course1,course2,course3};
		Instructor[] instructors = {instructor1}; 
		
		for (Courses course : courses) {
			
			System.out.println(course.id + " " + course.name);	
			
		}
		
		System.out.println("\n");
		
		
		CoursesManager coursesManager = new CoursesManager();
		
		coursesManager.addToCourse(course1);
		//coursesManager.deletedToCourse(course1);
		
		
		System.out.println("\n");
		
		for(Instructor instructor : instructors) {
					
			System.out.println(instructor1.firstLastName + " " + instructor1.information + ".");
		}
		
		
		
		for (Courses course : courses) {
					
			System.out.println(course.id + " " + course.name);	
					
		}

		
		
	}
	
}
