package newPackage;

abstract class Person {
	int personId;
	String name;
	int age;
	
	//abstract method
	abstract void goesToSchool();
	
	//concrete method
	void acceptBasicInfo(int id, String p_name, int p_age) {
		personId = id;
		name = p_name;
		age = p_age;
	}
}

class Student extends Person{

	int standard;
	
	Student(){}
	
	Student(int p_id, String p_name, int p_age, int s_std){
		this.personId = p_id;
		this.name = p_name;
		this.age = p_age;
		this.standard = s_std;
	}
	
	@Override
	void goesToSchool() {
		System.out.println("Student going to school");
	}
	
	//overloading
	int add (int a, int b) {
		return (a+b);
	}
	
	double add(double a, double b) {
		return (a+b);
	}
	
}

class Teacher extends Person{

	@Override
	void goesToSchool() {
		System.out.println("Teacher teaches at this school");
		
	}
	
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.add(12, 23));
		
		Person p;
	}
}
