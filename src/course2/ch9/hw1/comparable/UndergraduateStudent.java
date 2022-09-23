package course2.ch9.hw1.comparable;

import java.util.Date;

public class UndergraduateStudent extends Student {

	String minor;

	UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);

		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println("Undergraduate student is studying..");
	}

	@Override
	public void register() {
		System.out.println("Undergraduate student is registering..");
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + "]";
	}
}
