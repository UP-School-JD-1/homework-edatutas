package course2.ch9.hw1.comparator;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {

	VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println("Student is studying");
	}

	@Override
	public void register() {
		System.out.println("Student is registering");
	}

	@Override
	public String toString() {
		return " [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + "]";
	}
}
