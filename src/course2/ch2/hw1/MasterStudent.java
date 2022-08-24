package course2.ch2.hw1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}

	@Override
	public void study() {
		System.out.println("Master Student : " + name  + "is studying");
	}

	@Override
	public void register() {
		System.out.println("Master Student : " + name  + "is registering");
	}

	@Override
	public void writeThesis() {
		System.out.println("Master Student : " + name  + "is write thesis");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Master Student : " + name  + "is meet with advisor");
	}

	@Override
	public String toString() {
		return "MasterStudent [advisor=" + advisor + ", thesis=" + thesis + ", no=" + no + ", name=" + name + ", year="
				+ year + ", dob=" + dob + ", major=" + major + "]";
	}

	
	}

	

