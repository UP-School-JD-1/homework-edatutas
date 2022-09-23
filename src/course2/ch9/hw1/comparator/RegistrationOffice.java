package course2.ch9.hw1.comparator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationOffice {

	RegistrationOffice() {

	}

	void registerStudent(Student student) {

		if (student instanceof GraduateStudent graduateStudent1) {
			System.out.println("GraduateStudent" + graduateStudent1.toString());
		} else if (student instanceof VocationalStudent vocationalStudent1) {
			System.out.println("VocationalStudent" + vocationalStudent1.toString());
		} else if (student instanceof UndergraduateStudent undergraduateStudent1) {
			System.out.println("UndergraduateStudent" + undergraduateStudent1.toString());
		} else if (student instanceof MasterStudent masterStudent1) {
			System.out.println("MasterStudent" + masterStudent1.toString());
		} else if (student instanceof PhdStudent phdStudent1) {
			System.out.println("PhdStudent" + phdStudent1.toString());
		} else
			student.study();
	}

	Student getAStudent() {
		Student student = null;

		int i = (int) (5 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			student = new GraduateStudent(no, "Eda", 2016, new Date(), "Electrical and Electronics Engineering", "Enes",
					"Java");
			break;
		case 1:
			student = new VocationalStudent(no, "Enes", 2016, new Date(), "Electrical and Electronics Engineering");
			break;
		case 2:
			student = new UndergraduateStudent(no, "Ayse", 2016, new Date(), "Faculty of Law", "");
			break;
		case 3:
			student = new MasterStudent(no, "Nazan", 2015, new Date(), "Faculty of Law", "Eda", "Law");
			break;
		case 4:
			student = new PhdStudent(no, "Aybuke", 2015, new Date(), "Occupational Therapy", "Eda", "", true);
			break;
		}
		return student;
	}
	
	

	public List<AbstractStudent> getAllStudent(){
		List<AbstractStudent> list_student = new ArrayList<AbstractStudent>();
		
		list_student.add(new GraduateStudent(12, "Eda", 2016, new Date(), "Electrical and Electronics Engineering",
				"Enes", "Java"));
		list_student.add(new VocationalStudent(1, "Enes", 2016, new Date(), "Electrical and Electronics Engineer"));
		list_student.add(new UndergraduateStudent(98, "Ayse", 2016, new Date(), "Faculty of Law", "Lawyer"));
		list_student.add(new MasterStudent(654, "Nazan", 2015, new Date(), "Faculty of Law", "Eda", "Lawyer"));

		list_student.add(new GraduateStudent(2, "Elif", 2016, new Date(), "Arch", "Eng.", "Java"));
		return list_student;
		
	}

}
