package course2.ch5.hw1;

public class PayrollOffice {

	public void paySalary(Employee employees) throws SalaryPaidOnBankException {
		double salary = employees.calculateSalary();

		if (salary > 7000) {
			System.out.println(employees.toString());
			throw new SalaryPaidOnBankException(
					"Maasiniz 7000 TL den yuksek lutfen bankadan cekiniz..." + "\nMaasiniz =" + salary);

		} else {
			if (employees instanceof Secretary) {
				System.out.println("\n*************************");
				System.out.println("Hosgeldiniz");
				System.out.println(employees.toString());
				System.out.println("Buyrun maasiniz: " + salary);
				System.out.println("*************************\n");
			} else if (employees instanceof Engineer) {
				System.out.println("\n*************************");
				System.out.println("Hosgeldiniz");
				System.out.println(employees.toString());
				System.out.println("Buyrun maasiniz: " + salary);
				System.out.println("*************************\n");
			} else if (employees instanceof Manager) {
				System.out.println("\n*************************");
				System.out.println("Hosgeldiniz");
				System.out.println(employees.toString());
				System.out.println("Buyrun maasiniz: " + salary);
				System.out.println("*************************\n");

			} else if (employees instanceof Director) {
				System.out.println("\n*************************");
				System.out.println("Hosgeldiniz");
				System.out.println(employees.toString());
				System.out.println("Buyrun maasiniz: " + "\n" + salary);
				System.out.println("*************************\n");

			}
		}

	}
}
