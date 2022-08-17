package ch12.hw1;

import java.util.Objects;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle (int radius) {
		super("CIRCLE");
		this.radius=radius;
	}
	
	@Override
	void draw() {
		super.draw();
		System.out.println("Circle radius : " + radius);
		
	}
	
	@Override
	void erase(){
		super.erase();
	}
	
	
	@Override
	double calculateArea() {
		double area=Math.PI*(radius * radius); 
		System.out.println("Circle area : "+ area);
		return area;
	}
	
	
	@Override
	double calculateCircumference() {
		System.out.println("Circle circumference : " + 2*Math.PI*radius);
		return 2*Math.PI*radius;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


	
}
