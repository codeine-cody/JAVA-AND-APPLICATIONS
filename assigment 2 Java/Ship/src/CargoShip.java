
public class CargoShip extends Ship{
int tonnage;

public int getTonnage() {
	return tonnage;
}

public void setTonnage(int tonnage) {
	this.tonnage = tonnage;
}

@Override
public String toString() {
	return "CargoShip [tonnage =" + tonnage + "]";
}

}
