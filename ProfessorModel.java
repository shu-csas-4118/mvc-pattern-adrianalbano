package MVC;

public class ProfessorModel {
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	
	public ProfessorModel(String firstName, String lastName, String email, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhone() {
		return this.phoneNumber;
	}
	
	public void setPhone(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		String printThis = "";
		printThis = printThis + firstName +  " " + lastName + "\n" +
					"\t" + "Professor email: " + email + "\n" +
					"\t" + "Professor phone number: " + phoneNumber;
		return printThis;
	}
	
	public String printInfo() {
		
		System.out.print("\n");
		System.out.print("\n" + "Professor Details");
		System.out.print("\n" + "Name: " + firstName + " " + lastName);
		System.out.print("\n" + "Email: " + email);
		System.out.print("\n" + "Phone Number: " + phoneNumber);
		return " ";
	}

}
