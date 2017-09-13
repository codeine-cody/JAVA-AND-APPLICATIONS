
public class Rectangle extends Shape {
private double width, length;
 
public Rectangle(){
	super();
}
public Rectangle(int width, int length){
	this.width = width;
	this.length = length;
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
@Override
public String equals(Shape shape1) {
	// TODO Auto-generated method stub
	if(this.getArea() == shape1.getArea())
	return "True";
	else
		return "False";
}
@Override
public String isGreater(Shape shape1) {
	// TODO Auto-generated method stub
	if(this.getArea() >= shape1.getArea())
	return "True";
	else
		return "False";
	
}
@Override
public String isLess(Shape shape1) {
	// TODO Auto-generated method stub
	if(this.getArea() <= shape1.getArea())
	return "True";
	else
		return "False";
}
}
