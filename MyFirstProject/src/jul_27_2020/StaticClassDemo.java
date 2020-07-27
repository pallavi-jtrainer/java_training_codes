package jul_27_2020;
/*
 * Anything declared as static is within a class only.
 * Anything decalred as static means it is available as a single copy
 * static classes can be inner classes only.
 */
public class StaticClassDemo {
	static int i = 10;
	static void method1() {
		System.out.println("In static method - outer class");
	}
	
	void method() {
		System.out.println("Non-static mathod");
	}
	
	class InnerClass{
		 void method2() {
			System.out.println("In inner class");
		}
		
		void innerMethod() {
			System.out.println("Inner method");
		}
	}
	
	public static void main(String[] args) {
		method1();
		StaticClassDemo s = new StaticClassDemo();
		s.method();
		
		//StaticClassDemo.InnerClass.method2();
		
		StaticClassDemo.InnerClass in = new StaticClassDemo().new InnerClass();
		in.innerMethod();
	}
}
