
public class Dog extends Animal {
public Dog(){
		
}
public Dog(String breed, String name, int age){
	this.breed = breed;
	this.name = name;
	this.age = age;
}
public void makeNoise(){
	System.out.println("bark");
}
@Override
public String toString() {
	return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + ", getBreed()=" + getBreed() + ", getName()="
			+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
