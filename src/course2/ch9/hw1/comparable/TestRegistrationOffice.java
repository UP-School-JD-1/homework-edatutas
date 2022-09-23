package course2.ch9.hw1.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestRegistrationOffice {

	public static void main(String[] args) {

		List<Student> list_student = new ArrayList<Student>();

		list_student.add(new Student(1, "Eda ", 1997, new Date(), "Engineer"));
		list_student.add(new Student(17, "Enes ", 1997, new Date(), "Engineer"));
		list_student.add(new Student(2543, "Ayse ", 1997, new Date(), "Law"));
		list_student.add(new Student(1789, "Nazan ", 1997, new Date(), "Law"));

		Collections.sort(list_student);

		for (Student s : list_student) {
			System.out.println(s);
		}

	}

}
