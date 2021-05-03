package Inheritance;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" eðitimci eklendi");
	}
}
