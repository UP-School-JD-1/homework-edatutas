package course2.ch3.hw1;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRegistrationOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student1 = registrationOffice.getAStudent();
		Student student2 = registrationOffice.getAStudent();
		Student student3 = registrationOffice.getAStudent();
		Student student4 = registrationOffice.getAStudent();
		Student student5 = registrationOffice.getAStudent();

		registrationOffice.registerStudent(student1);
		registrationOffice.registerStudent(student2);
		registrationOffice.registerStudent(student3);
		registrationOffice.registerStudent(student4);
		registrationOffice.registerStudent(student5);

	}

}
