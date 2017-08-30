
public class Rectangle extends Shape{
private double width, length;

public Rectangle(){
	super();
}
public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}
public double getArea(){
	return length * width;
}
public double getPerimeter(){
	return 2 * width + 2 * length;
}
}
