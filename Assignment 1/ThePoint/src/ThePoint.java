
public class ThePoint {
private int x;
private int y;

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

public static double getDistance(ThePoint p1 , ThePoint p2 ) {
	return Math.sqrt(Math.pow((double)(p1.getX() - p2.getX()), 2) + Math.pow((double)(p1.getY() - p2.getY()), 2));

}

}

