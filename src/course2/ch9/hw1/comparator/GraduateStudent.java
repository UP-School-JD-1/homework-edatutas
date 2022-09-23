package course2.ch9.hw1.comparator;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {

	protected String advisor;
	protected String thesis;

	GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;

	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	@Override
	public void study() {
		System.out.println("GraduateStudent is studying");
	}

	@Override
	public void register() {
		System.out.println("GraduateStudent is registering");
	}

	public void writeThesis() {
		System.out.println("GraduateStudent is write thesis");
	}

	public void meetWithAdvisor() {
		System.out.println("GraduateStudent" + name + " is meet with advisor + advisor");

	}

}
