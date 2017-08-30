import java.util.Date;

public abstract class Shape {

String color = "white";
boolean filled = false;
java.util.Date DateCreated = new java.util.Date();;

public Shape(){
	
}
public String getColor(){
	
	return color;
}
public void setColor(String color){
	this.color = color;
}
public boolean isfilled(){
	return this.filled;
}
public void setfilled(boolean filled){
	this.filled = filled;
}
public long getDateCreated(){
	return this.DateCreated.getTime();
}
public String toString() {
	return "Shape [color=" + color + ", filled=" + filled + "]";
}

}
