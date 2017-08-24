import java.util.Scanner;

public class PointTest {
public static void main(String[]args){
	Scanner reader = new Scanner(System.in);

	
	ThePoint[] PointArray  = new ThePoint[2];
	
	for ( int i = 0; i < PointArray.length; i++) {
		PointArray[i] = new ThePoint();
		System.out.println("Enter x value for point " + (i + 1));
		PointArray[i].setX(reader.nextInt());
		System.out.println("Enter y value for point " + (i + 1));
		PointArray[i].setY(reader.nextInt());
	}
	
	
	System.out.println("The points are (" + PointArray[0].getX() + "," +PointArray[0].getY() + ")" + "and ("  + PointArray[1].getX() + "," +PointArray[1].getY() + ")");
	
	System.out.println("The distance between these points is " + ThePoint.getDistance(PointArray[0], PointArray[1]));
	
}
}
