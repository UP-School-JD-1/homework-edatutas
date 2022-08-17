package ch12.hw1;

import java.util.Objects;

public class Square extends Shape {
	
	int a;
	public Square(int a) {
		super("SQUARE");
		this.a=a;
	}
	
	@Override
	void draw() {
		System.out.println("*************************    " + name + "    *************************");
		System.out.println("Square Edge : " + a);
	}
	
	@Override
	void erase() {
		super.erase();
	}
	
	@Override
	double calculateArea() {
		System.out.println("Square area : " + a*a);
		return a*a;
	}
	
	@Override
	double calculateCircumference() {
		System.out.println("Square circumference : " + 4*a);
		return 4*a;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return a == other.a;
	}

	@Override
	public String toString() {
		return "Square [a=" + a + "]";
	}
	
	

}
