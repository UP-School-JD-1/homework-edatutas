package course2.ch2.hw1;

public class RegistrationOffice {

	RegistrationOffice() {

	}

	Student getAStudent(Student student) {
		System.out.println(student.getName());
		return student;
	}

	public void RegisterStudent(Student student) {

		System.out.println("Student's name: " + student.getName());
		System.out.println("Student number: " + student.getNo());
		System.out.println("Student's major : " + student.getMajor());
		System.out.println("Student's registration date: " + student.getDob());

	}

}
