
public class Car extends Automobile{
protected int maxPassengers;

public Car() {
	super();
	this.maxPassengers = 0;// TODO Auto-generated constructor stub
}

public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
	super(year, weight, licensePlate, make);
	this.maxPassengers = maxPassengers;// TODO Auto-generated constructor stub
}

public int getMaxPassengers() {
	return maxPassengers;
}

public void setMaxPassengers(int maxPassengers) {
	this.maxPassengers = maxPassengers;
}

@Override
public String toString() {
	return "Car [maxPassengers=" + maxPassengers + ", licensePlate=" + licensePlate + ", make=" + make + ", year="
			+ year + ", weight=" + weight + "]";
}

}
