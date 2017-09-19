
public class Cat extends Animal{
public Cat(){
		
}
public Cat(String breed, String name, int age){
	this.breed = breed;
	this.name = name;
	this.age = age;
}
public void makeNoise(){
	System.out.println("Meow");
}
@Override
public String toString() {
	return "Cat [breed=" + breed + ", name=" + name + ", age=" + age + ", getBreed()=" + getBreed() + ", getName()="
			+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}
