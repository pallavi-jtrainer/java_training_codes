package newPackage;

//super class
public class Animal {
	String animalName;
	
	void speak() {
		System.out.println("Speaking");
	}
}

//subclass
class Dog extends Animal{
//	void speak() {
//		System.out.println("Barking");
//	}
}

//sub sub class
class Poodle extends Dog{
	
}

