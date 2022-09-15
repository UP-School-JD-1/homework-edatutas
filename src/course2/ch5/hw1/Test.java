package course2.ch5.hw1;

public class Test {

	public static void main(String[] args) throws SalaryPaidOnBankException {

		HR hr = new HR();
		PayrollOffice payrollOffice = new PayrollOffice();

		Employee employee1 = hr.getAnEmployee();

		try {
			payrollOffice.paySalary(employee1);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		System.out.println("\n***********************");

		Employee employee2 = hr.getAnEmployee();

		try {
			payrollOffice.paySalary(employee2);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		System.out.println("\n***********************");

		Employee employee3 = hr.getAnEmployee();

		try {
			payrollOffice.paySalary(employee3);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		System.out.println("\n***********************");
		Employee employee4 = hr.getAnEmployee();
		try {
			payrollOffice.paySalary(employee4);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}
}
