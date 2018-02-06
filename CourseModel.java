package MVC;

public class CourseModel {
	private String courseName;
	private int courseNumber;
	private int credits;
	private ProfessorModel professor;
	
	public CourseModel(String courseName, int courseNumber, int credits, ProfessorModel professor) {
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.credits = credits;		
		this.professor = professor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseNumber() {
		return this.courseNumber;
	}
	
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public ProfessorModel getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(ProfessorModel professor) {
		this.professor = professor;
	}

}
