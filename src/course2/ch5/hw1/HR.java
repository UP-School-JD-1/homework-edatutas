package course2.ch5.hw1;

public class HR {

	void hR(Employee employee) {

		if (employee instanceof Secretary secretary1) {
			System.out.println("Secretary" + secretary1.toString());
		} else if (employee instanceof Engineer engineer1) {
			System.out.println("Engineer" + engineer1.toString());
		} else if (employee instanceof Manager manager1) {
			System.out.println("Manager" + manager1.toString());
		} else if (employee instanceof Director director1) {
			System.out.println("Director" + director1.toString());
		} else
			employee.work();
	}

	public Employee getAnEmployee() {
		Employee e = null;

		int i = (int) (4 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			e = new Secretary(no, "Sevim", 2, "Sales", 9567, new Manager(3, "Kamil", 17, "Sales", "Sales", 567));
			break;
		case 1:
			e = new Engineer(no, "Burhan", 5, "Production", "Improving production.", 37);
			break;
		case 2:
			e = new Manager(no, "Ismail", 15, "Production", "Production", 128);
			break;
		case 3:
			e = new Director(no, "Salih", 19, "Management", "Management", 12000, 589);
			break;
		}
		return e;
	}
}
