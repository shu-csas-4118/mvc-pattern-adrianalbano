package MVC;

public class StudentView {
	private StudentModel student;
	
	public StudentView(StudentModel student) {
		this.student = student;
	}
	
	
	public void printStudentDetails(StudentModel student) {
		this.student = student;
		printStudentDetails();
	}
	
	public void setStudentDetails(StudentModel student) {
		
	}
	
	public void printStudentDetails() {
		
		if(this.student == null) throw new IllegalArgumentException("student");
		
		System.out.print("Student Details");
		System.out.print("\n");
		System.out.print("\n" + "Student's first name: " + this.student.getFirstName());
		System.out.print("\n" + "Student's last name: " + this.student.getLastName());
		System.out.print("\n" + "Student's ID number: " + this.student.getIDNumber());
		System.out.print("\n" + "Student's email: " + this.student.getEmail());
		System.out.println("");
	}
	
	public void printCourseDetails() {
		for(CourseModel course: this.student.getCourses()) {
			if(course == null) throw new IllegalArgumentException("CourseModel");
			
			System.out.print("Course Details");
			System.out.print("\n");
			System.out.print("\n" + "Course Name: " + course.getCourseName());
			System.out.print("\n" + "Course Number: " + course.getCourseNumber());
			System.out.print("\n" + "Credits: " + course.getCredits());
			System.out.print("\n" + "Professor" + course.getProfessor());
		}
	}

}
