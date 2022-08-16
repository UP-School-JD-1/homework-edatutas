package ch9.point;

public class Point {
	int x;
	int y;
	

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point(int x) {
		this(x, 12);
	}

	Point() {
		this(5, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	// Point 1 Distance to Origin
	
	
	double calculateDistanceToOrigin() {
		System.out.println("**** Distance To Origin ****");
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	
	
	// Point1 - Point Distance 

	double calculateDistanceToPoint(int a, int b) {
		System.out.println("\n**** Distance To Point  ****");
		return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
	}
	
	
	
	
	
	//clone
	
	void clone(int x, int y) {
		this.setX(x);
		this.setY(y);
		System.out.println("\n**** Clone Point ****");
		System.out.println("Clone x : " + x);
		System.out.println("Clone y : " + y);
	
		
	}
	
	
	
	//move
	
	void move(char direction, int amount) {  
		if(direction == 'x')
			x += amount;
		else if (direction == 'y')
			y += amount;
		System.out.println("\n********   Move  ******** ");
		System.out.println("New coordinate x : "  + x );
		System.out.println("New coordinate y : "  + y );
	}
	
	
	
	}
	
