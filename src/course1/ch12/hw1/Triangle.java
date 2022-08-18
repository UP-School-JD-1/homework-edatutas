package course1.ch12.hw1;

import java.util.Objects;

public class Triangle extends Shape{
	
	private int a , b, c;
	
	public Triangle(int a, int b, int c) {
		super("TRIANGLE");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
	@Override
	void draw() {
		System.out.println("*************************    " + name + "    *************************");
		System.out.println("Triangle Edge 1 : " + a + "\nRectangle Edge 2 : "  + b + "\nRectangle Edge 3 : "  + c );
	}
	
	
	
	@Override
	void erase() {
		super.erase();
	}
	


	@Override
	double calculateArea() {
		double S = (a + b + c)/2;
		double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
		System.out.println("Triangle area : " + area);
		return area;
	}
	
	@Override
	double calculateCircumference() {
		double circumference = (a + b + c) ;
		System.out.println("Triangle circumference : " + circumference);
		return circumference;
	}


	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return a == other.a && b == other.b && c == other.c;
	}


	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	

	

}
