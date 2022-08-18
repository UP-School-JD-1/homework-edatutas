package course1.ch12.hw1;

import java.util.Objects;

public class Rectangle extends Shape {
	
	
	private int a,b;
	
	public Rectangle(int a, int b) {
		super("RECTANGLE");
		this.a=a;
		this.b=b;
		
	}
	
	
	@Override
	void draw() {
		super.draw();
		System.out.println("Rectangle Edge 1 : " + a + "\nRectangle Edge 2 : "  + b );
		
	}
	
	
	@Override
	void erase() {
		super.erase();
	}
	
	@Override
	double calculateArea() {
		System.out.println("Rectangle area : "  + a*b);
		return a*b;
	}
	
	@Override
	double calculateCircumference() {
		System.out.println("Rectangle circumference : " + 2*(a+b));
		return 2*(a+b);
	}


	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return a == other.a && b == other.b;
	}


	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
	

}
