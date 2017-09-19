
public class AnimalTest {
public static void main(String[]args){
	Cat cat1 = new Cat("Russian Blue", "Sammy", 1);
	System.out.println(cat1.toString());
	cat1.makeNoise();
	Dog dog1 = new Dog("Great  Pyrenees", "Blacky", 2);
	System.out.println(dog1.toString());
	dog1.makeNoise();
	
}
}
