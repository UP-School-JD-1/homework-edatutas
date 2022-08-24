package course2.ch2.hw1;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRegistrationOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		System.out.println("\n\n****************** GraduateStudent ***************************");
		Student student1 = new GraduateStudent(12, "Eda ", 1997, new Date(), "CE", "Ayşe", "Java");

		if (student1 instanceof GraduateStudent graduateStudent1) {
			System.out.println("Student 1 graduateStudent : " + student1.getName());
			System.out.println(graduateStudent1.toString());
		}

		System.out.println("\n\n****************** MasterStudent ***************************");

		Student student2 = new GraduateStudent(17, "Enes ", 1997, new Date(), "CE", "Eda", "Java");

		if (student2 instanceof MasterStudent masterStudent2) {
			System.out.println("Student 2 GraduateStudent : " + student2.getName());
			System.out.println(masterStudent2.toString());
		} else
			System.out.println(student2.getName() + "Student 2 isn't MasterStudent ");
		System.out.println();

		System.out.println("\n\n****************** UndergraduateStudent ***************************");

		Student student3 = new UndergraduateStudent(15, "Ayse", 1997, new Date(), "Hukuk", "eee");
		if (student3 instanceof UndergraduateStudent undergraduateStudent1) {
			System.out.println("Student 3 UndergraduateStudent : " + student3.getName());
			System.out.println(undergraduateStudent1.toString());
		}

		System.out.println("\n\n****************** PhdStudent ***************************");

		Student student4 = new PhdStudent(6, "Enes", 893, new Date(), "EEE", "eee", "eee", false);

		if (student4 instanceof PhdStudent phdStudent1) {
			System.out.println("Student 4 GraduateStudent : " + student4.getName());
			System.out.println(phdStudent1.toString());
		} else
			System.out.println(student4.getName() + "Student 4 isn't PhD Student ");
		System.out.println();

		System.out.println("\n\n****************** VocationalStudent ***************************");

		Student student5 = new VocationalStudent(56, "Nazan", 1997, new Date(), "Hukuk");
		if (student5 instanceof VocationalStudent vocationalStudent1) {
			System.out.println("Student 5 VocationalStudent : " + student5.getName());
			System.out.println(vocationalStudent1.toString());
		}

		System.out.println("\n\n****************** RegistrationOffice ***************************");

		registrationOffice.RegisterStudent(student4);
		student4.equals(student2);

	}

}
