package MVC;
import java.util.ArrayList;

public class RegistrationController {
	private StudentModel student;
	private ArrayList<CourseModel> courses;
	private RegistrationView registrationView;
	
	public RegistrationController(StudentModel student, ArrayList<CourseModel> courses, RegistrationView registrationView) {
		this.student = student;
		this.courses = courses;
		this.registrationView = registrationView;
	}
	
	public void printAvailableCourses() {
		this.registrationView.printAvailableCourses(this.courses);
	}
	

}
