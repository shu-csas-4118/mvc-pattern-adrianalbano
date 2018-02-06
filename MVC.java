package MVC;
import java.util.ArrayList;

public class MVC {
	
	public static void main(String[] args) {
		ArrayList<CourseModel> courses = new ArrayList<CourseModel>();
		
		StudentModel student = new StudentModel("Adrian", "Albano", 1234, "adrian.albano@student.shu.edu", courses);
		StudentView studentView = new StudentView(student);
		StudentController studentController = new StudentController(student, studentView);
		
		studentController.printStudentDetails();
		
		ProfessorModel garret = new ProfessorModel("Garrett", "Chang", "changgar@shu.edu", 1);
		ProfessorModel matthew = new ProfessorModel("Matthew", "Wilson", "wilsonmat@shu.edu", 2);
		//ProfessorView professorView = new ProfessorView();
		//ProfessorController professorController = new ProfessorController(professor, professorView);
		
		CourseModel software = new CourseModel("Software Engineering II", 4118, 3, garret);
		CourseModel sociology = new CourseModel("Intro to Sociology", 1001, 3, matthew);
		
		courses.add(software);
		courses.add(sociology);
		
		RegistrationView registrationView = new RegistrationView();
		RegistrationController registrationController = new RegistrationController(student, courses, registrationView);
		
		registrationController.printAvailableCourses();
		registrationView.RegisterCourses(student, courses);
		
		System.out.println(" ");
		System.out.println("Registered Courses: 2");
		studentController.printCourseDetails();
	}

}
