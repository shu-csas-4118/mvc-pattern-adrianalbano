package MVC;
import java.util.ArrayList;

public class RegistrationView {
	private StudentModel student;
	private ArrayList<CourseModel> courses;
	
	public void RegisterCourses(StudentModel student, ArrayList<CourseModel> courses) {
		this.student = student;
		this.courses = courses;
	}
	
	public void printAvailableCourses(ArrayList<CourseModel> courses) {
		this.courses = courses;
		printAvailableCourses();
	}
	
	public void printAvailableCourses() {
		for (CourseModel course: courses) {
			
			System.out.println(" ");
			System.out.println("Available Courses: " );
			System.out.println("Course: " + course.getCourseName());
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Professor: " + course.getProfessor());
			}
		}

}
