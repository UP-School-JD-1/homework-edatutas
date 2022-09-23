package course2.ch9.hw1.comparable;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println("Student is studying..");
	}

	@Override
	public void register() {
		System.out.println("Student is registering..");
	}

	@Override
	public void writeThesis() {

	}

	@Override
	public void meetWithAdvisor() {

	}

	public void writePaper() {

	}
}
