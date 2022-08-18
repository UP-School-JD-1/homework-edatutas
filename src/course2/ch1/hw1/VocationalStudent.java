package course2.ch1.hw1;
import java.util.Date;

public class VocationalStudent extends Student{

	
	VocationalStudent(int no,String name,int year, Date dob , String major){
		super(no,name,year,dob,major);
		
		
//	VocationalStudent(int no,String name,int year , String major){
//		super(no,name,year,major);
		
	}
	
	
	@Override
	public void study() {
        System.out.println("Student is studying..");
    }

	@Override
    public void register() {
        System.out.println("Student is registering..");
    }

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + "]";
	}
}
