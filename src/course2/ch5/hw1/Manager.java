package course2.ch5.hw1;

public class Manager extends Employee {
	protected String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 3000;

	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged,
			double calculateSalary) {
		super(no, name, year, workingDepartment, calculateSalary);
		this.departmentManaged = departmentManaged;
	}

	public void work() {
		System.out.println("Manager is working!");
		manage();
	}

	public void manage() {
		System.out.println("Manager manages department: " + departmentManaged);
	}

	public double calculateSalary() {
		return super.calculateSalary() + MANAGEMENT_PAYMENT;
	}

	public void printInfo() {
		System.out.println("\nManager Info");
		super.printInfo();
		System.out.println("Managing Department: " + departmentManaged);
	}

	@Override
	public String toString() {
		return "Manager [no=" + no + ", departmentManaged=" + departmentManaged + ", name=" + name + ", year=" + year
				+ ", department=" + department + ", salary=" + calculateSalary + "]";
	}
}
