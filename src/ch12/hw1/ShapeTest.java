package ch12.hw1;

public class ShapeTest {

	public static void main(String[] args) {
		
		
		Circle circle1=new Circle(1);
		Circle circle2=new Circle(1);
		
		Rectangle rectangle1 = new Rectangle(2,3);
		Rectangle rectangle2 = new Rectangle(5,6);
		
		Square square1 = new Square(4);
		Square square2 = new Square(4);
		
		Triangle triangle1 = new Triangle(5,6,7); 
		Triangle triangle2 = new Triangle(5,6,7);
		
		
		circle1.draw();
		circle1.calculateArea();
		circle1.calculateCircumference();
		circle1.erase();
		System.out.println("Circle1 hashCode = " + circle1.hashCode() );
		System.out.println("Circle1 hashCode = " + circle2.hashCode() );
		System.out.println("Circle1 and Circle2 are equals = " + circle1.equals(circle2));
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		
		rectangle1.draw();
		rectangle1.calculateArea();
		rectangle1.calculateCircumference();
		rectangle1.erase();
		System.out.println("Rectangle1 hashCode = " + rectangle1.hashCode() );
		System.out.println("Rectangle2 hashCode = " +rectangle2.hashCode() );
		System.out.println("Rectangle1 and Rectangle2 are equals = " +rectangle1.equals(rectangle2));
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		
		
		
		square1.draw();
		square1.calculateArea();
		square1.calculateCircumference();
		square1.erase();
		System.out.println("Square1 hashCode = " +square1.hashCode() );
		System.out.println("Square2 hashCode = " +square2.hashCode() );
		System.out.println("Square1 and Square2 are equals  = " +square1.equals(square2));
		System.out.println(square1.toString());
		System.out.println(square2.toString());
		
		
		
		triangle1.draw();
		triangle1.calculateArea();
		triangle1.calculateCircumference();
		triangle1.erase();
		System.out.println("Triangle1 hashCode = " +triangle1.hashCode() );
		System.out.println("Triangle2 hashCode = " +triangle2.hashCode() );
		System.out.println("Triangle1 and Triangle2 are equals = " +triangle1.equals(triangle2));
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		
		
	}

}
