package course2.ch3.hw1;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {

	String minor;

	UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);

		this.minor = minor;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println("Undergraduate student is studying");
	}

	@Override
	public void register() {
		System.out.println("Undergraduate student is registering");
	}

	@Override
	public String toString() {
		return " [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + "]";
	}
}
