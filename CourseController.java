package MVC;

public class CourseController {
	private CourseView courseView;
	private CourseModel course;
	
	public CourseController (CourseModel course, CourseView courseView) {
		this.course = course;
		this.courseView = courseView;
	}
	
	public void printCourseDetails() {
		this.courseView.printCourseDetails(this.course);
	}
}
