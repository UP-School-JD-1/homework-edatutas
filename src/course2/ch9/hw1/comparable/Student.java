package course2.ch9.hw1.comparable;

import java.util.Date;

public class Student implements Comparable<Student> {

	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;

	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void study() {
		System.out.println("Student is studying..");
	}

	public void register() {
		System.out.println("Student is registering..");
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.no < o.no) {

			return -1;

		} else if (this.no > o.no) {
			return 1;

		}
		return 0;
	}

}
