package MVC;
import java.util.ArrayList;

public class StudentModel {
	private String firstName;
	private String lastName;
	private int idNumber;
	private String email;
	private ArrayList<CourseModel> courses;
	
	public StudentModel(String firstName, String lastName, int idNumber, String email, ArrayList<CourseModel> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.courses = courses;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIDNumber() {
		return this.idNumber;
	}
	
	public void setIDNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<CourseModel> getCourses() {
		return this.courses;
	}
	
	public void setCourses(ArrayList<CourseModel> courses) {
		this.courses = courses;
	}

}
