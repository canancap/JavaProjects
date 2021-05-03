package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"JAVA",1);
		Course course2 = new Course(2,"C#",1);
		Course course3 = new Course(3,"PYTHON",2);
		Course [] courses = {course1,course2,course3};
		System.out.println("Kurslarımız: ");
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		System.out.println("-------------------");
		
		User user1 = new User(1,"canan","çap","canancap@yahoo.com");
		
		UserManager userManagers = new UserManager();
		userManagers.add(user1);
		
		
		
		
		System.out.println("-------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		courseManager.deleteCourse(course2);
	}

}
