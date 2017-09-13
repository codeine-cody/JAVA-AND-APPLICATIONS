
public abstract class Vehicle {
protected int year;
protected double weight;

public Vehicle(){
	this.year = 0000;
	this.weight = 0;
}
public Vehicle(int year, double weight){
	this.year = year;
	this.weight = weight;	
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
@Override
public String toString() {
	return "Vehicle [year=" + year + ", weight=" + weight + "]";
}

}
