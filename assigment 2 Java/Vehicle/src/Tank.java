
public class Tank extends Vehicle{
protected double armorWidth;

public Tank(){
	super();
	this.armorWidth = 0;
}
public Tank(int year, double weight, double armorWidth){
	this.year = year;
	this.weight = weight;
	this.armorWidth = armorWidth;

}
public double getArmorWidth() {
	return armorWidth;
}
public void setArmorWidth(double armorWidth) {
	this.armorWidth = armorWidth;
}
@Override
public String toString() {
	return "Tank [armorWidth=" + armorWidth + ", year=" + year + ", weight=" + weight + "]";
}

}
