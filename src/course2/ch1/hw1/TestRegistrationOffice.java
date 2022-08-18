package course2.ch1.hw1;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRegistrationOffice {

	public static void main(String[] args) {
		
		
		RegistrationOffice registrationOffice= new RegistrationOffice();
	
		System.out.println("****************** Graduate Student ***************************");
		Student student1 = new Student(1, "Eda ",1997,new Date(), "eem");
		
		
		if(student1 instanceof GraduateStudent){
			System.out.println("Student 1 GraduateStudent : " + student1.getName());
			GraduateStudent graduateStudent1 = (GraduateStudent) student1; 	
			System.out.println(graduateStudent1.toString());
		}
		else
			System.out.println(student1.getName() + "Student 1 isn't GraduateStudent " );
		
		System.out.println("\n\n****************** MasterStudent ***************************");
		
	
		Student student2= new GraduateStudent(17, "Hatice ", 56, new Date(), "", "", "");
		
		if(student2 instanceof MasterStudent){
			System.out.println("Student 1 GraduateStudent : " + student2.getName());
			MasterStudent masterStudent2 = (MasterStudent) student2; 	
			System.out.println(masterStudent2.toString());
		}
		else
			System.out.println(student2.getName() + "Student 2 isn't MasterStudent " );
		System.out.println();
		
		
		
		System.out.println("\n\n****************** UndergraduateStudent ***************************");
		
		
		Student student3 = new UndergraduateStudent(12, "Eda", 1997, new Date(),"EEM", "eem");
		if(student3 instanceof UndergraduateStudent){
			System.out.println("Student 3 UndergraduateStudent : " + student3.getName());
			UndergraduateStudent undergraduateStudent1 = (UndergraduateStudent) student3; 	
			System.out.println(undergraduateStudent1.toString());
		}
		
		
		
		System.out.println("\n\n****************** PhdStudent ***************************");
		
		
		Student student4= new PhdStudent(6, "Enes", 893, new Date(), "", "", "", false);
		
		if(student4 instanceof PhdStudent){
			System.out.println("Student 4 GraduateStudent : " + student4.getName());
			PhdStudent phdStudent1 = (PhdStudent) student4; 	
			System.out.println(phdStudent1.toString());
		}
		else
			System.out.println(student4.getName() + "Student 4 isn't MasterStudent " );
		System.out.println();
		
		System.out.println("\n\n****************** RegistrationOffice ***************************");
		
		

		registrationOffice.RegisterStudent(student4);
		student4.equals(student2);
		System.out.println(student1.equals(student2));
		student1.register();
		
		
	}

}
