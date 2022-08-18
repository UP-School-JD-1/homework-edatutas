package course1.ch12.hw1;

public class Shape {
	protected String name;
	
	public Shape(String name){
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void draw() {
		System.out.println("\n\n*************************    " +  name +  "    *************************");
		
	}
	
	
	void erase() {
		System.out.println("Erasing\n\n");
	}
	
	
	double calculateArea() {
		return 0.0;
	}
	
	
	double calculateCircumference() {
		return 0.0;
	}
	

	
}
