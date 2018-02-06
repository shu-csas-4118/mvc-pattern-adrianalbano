package MVC;

public class StudentController {
	private StudentView studentView;
	private StudentModel student;
	
	public StudentController(StudentModel student, StudentView studentView) {
		this.student = student;
		this.studentView = studentView;
	}
	
	public void printStudentDetails() {
		this.studentView.printStudentDetails(this.student);
	}
	
	public void printCourseDetails() {
		this.studentView.printCourseDetails();
	}

}
