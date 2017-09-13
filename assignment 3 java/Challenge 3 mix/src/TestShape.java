

public class TestShape {
public static void main(String[]args){
	Rectangle rec1 = new Rectangle(5,5);
	Circle cir1 = new Circle(5);
	
	System.out.println("Area of circle: " + cir1.getArea());
	
	
	System.out.println("Area of rectangle: " + rec1.getArea());
	
	
	
	System.out.println("circle is equal to rectangle: " + cir1.equals(rec1) );
	System.out.println("circle is greater than rectangle: " + cir1.isGreater(rec1));
	System.out.println("circle is less than rectangle: " + cir1.isLess(rec1));
	
	
	System.out.println("rectangle is equal to circle: " + rec1.equals(cir1));
	System.out.println("rectanlge is greater than circle: " + rec1.isGreater(cir1));
	System.out.println("rectangle is less than circle: " + rec1.isLess(cir1));
	
	
}
}
