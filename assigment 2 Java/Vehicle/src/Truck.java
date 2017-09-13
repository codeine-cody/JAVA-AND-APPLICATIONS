
public class Truck extends Automobile{
protected double towCapacity;

public Truck() {
	super();
	this.towCapacity = 0;// TODO Auto-generated constructor stub
}

public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
	super(year, weight, licensePlate, make);
	this.towCapacity = towCapacity;// TODO Auto-generated constructor stub
}

public double getTowCapacity() {
	return towCapacity;
}

public void setTowCapacity(double towCapacity) {
	this.towCapacity = towCapacity;
}

@Override
public String toString() {
	return "Truck [towCapacity=" + towCapacity + ", licensePlate=" + licensePlate + ", make=" + make + ", year=" + year
			+ ", weight=" + weight + "]";
}

}
