package MVC;

public class ProfessorView {
	private ProfessorModel professor;
	
	public ProfessorView(ProfessorModel professor) {
		this.professor = professor;
	}
	
	public ProfessorView() {		
	}
	
	public void printProfessorDetails(ProfessorModel professor) {
		this.professor = professor;
		printProfessorDetails();
	}
	
	public void setProfessorDetails(ProfessorModel professor) {
	}
	
	public void printProfessorDetails() {
		
		if (this.professor == null) throw new IllegalArgumentException("professor");
		
		System.out.print("\n");
		System.out.print("\n" + "Professor Details");
		System.out.print("\n" + "Name: " + this.professor.getFirstName() + " " + this.professor.getLastName());
		System.out.print("\n" + "Email: " + this.professor.getEmail());
		System.out.print("\n" + "Phone Number: " + this.professor.getPhone());
		System.out.println(" ");
	}

}
