package course2.ch9.hw1.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestRegistrationOffice {

	public static void main(String[] args) {
		RegistrationOffice registrationOffice = new RegistrationOffice();

		List<AbstractStudent> list_student = registrationOffice.getAllStudent();

		list_student.add(new GraduateStudent(5434, "hatice", 2016, new Date(), "Software","Enes", "Java"));

		Collections.sort(list_student, new StudentComparator());

		for (AbstractStudent s : list_student) {
			System.out.println(s);
		}

	}
}
