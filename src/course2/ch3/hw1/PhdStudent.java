package course2.ch3.hw1;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println("PhDStudent is studying");
	}

	@Override
	public void register() {
		System.out.println("PhDStudent is registering");
	}

	@Override
	public void writeThesis() {
		System.out.println("PhDStudent is write thesis");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("PhDStudent is meet advisor");
	}

	public void writePaper() {
		System.out.println("PhDStudent is write paper");
	}

}
