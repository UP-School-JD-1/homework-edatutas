package course1.ch9.point;


public class PointTest {
	
	

	public static void main(String[] args) {
		
		
		
		Point point1 = new Point(1,0) ;
		Point point2 = new Point();
	        
	        
		System.out.println("Point 1 Calculate Distance To Origin :    "  + point1.calculateDistanceToOrigin());
		
		System.out.println("Calculate Distance To Point          :    "  + point1.calculateDistanceToPoint(5,0));
		
		
		point1.clone(8,10);
		
		point2.move('x',5);
		
	}
}
