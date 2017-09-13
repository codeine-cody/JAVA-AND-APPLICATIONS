
public class CruiseShip extends Ship{
int passengersMax;

public int getPassengersMax() {
	return passengersMax;
}

public void setPassengersMax(int passengersMax) {
	this.passengersMax = passengersMax;
}

@Override
public String toString() {
	return  "CruiseShip [passengersMax =" + passengersMax + "]";
}

}
