package MVC;

public class ProfessorController {
	private ProfessorView professorView;
	private ProfessorModel professor;
	
	public ProfessorController(ProfessorModel professor, ProfessorView professorView) {
		this.professor = professor;
		this.professorView = professorView;
	}
	
	public void printProfessorDetails() {
		this.professorView.printProfessorDetails(this.professor);
	}

}
