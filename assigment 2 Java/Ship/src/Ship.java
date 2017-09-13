
public class Ship {
String name;
int builtYear;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBuiltYear() {
	return builtYear;
}
public void setBuiltYear(int builtYear) {
	this.builtYear = builtYear;
}
@Override
public String toString() {
	return "Ship [name=" + name + ", builtYear=" + builtYear + "]";
}

}
