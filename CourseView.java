package MVC;

public class CourseView {
	private CourseModel course;
	
	public CourseView(CourseModel course) {
		this.course = course;
	}
	
	public void printCourseDetails(CourseModel course) {
		this.course = course;
		printCourseDetails();
	}
	
	public void setCourseDetails(CourseModel course) {
		
	}
	
	public void printCourseDetails() {
		if(this.course == null) throw new IllegalArgumentException("CourseModel");
		
		System.out.print("Course Details");
		System.out.print("\n");
		System.out.print("\n" + "Course Name: " + this.course.getCourseName());
		System.out.print("\n" + "Course Number: " + this.course.getCourseNumber());
		System.out.print("\n" + "Credits: " + this.course.getCredits());
		System.out.print("\n" + "Professor" + this.course.getProfessor());
	}

}
