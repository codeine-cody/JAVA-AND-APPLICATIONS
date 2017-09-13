
public abstract class Automobile extends Vehicle{
protected String licensePlate;
protected String make;

public Automobile() {
	super();
	this.licensePlate = "unknown";
	this.make = "unknown";// TODO Auto-generated constructor stub
}
public Automobile(int year, double weight, String licensePlate, String make) {
	this.licensePlate = licensePlate;
	this.make = make;
	this.year = year;
	this.weight = weight;
	
}
public String getLicensePlate() {
	return licensePlate;
}
public void setLicensePlate(String licensePlate) {
	this.licensePlate = licensePlate;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
@Override
public String toString() {
	return "Automobile [licensePlate=" + licensePlate + ", make=" + make + ", year=" + year + ", weight=" + weight
			+ "]";
}

}
