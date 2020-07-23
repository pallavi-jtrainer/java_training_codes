package newPackage;

public class OperatorsDemo {

	int add (int a, int b) {
		return (a + b);
	}
	
	int subtract(int a, int b) {
		return (a - b);
	}
	
	int divide(int a, int b) {
		if( a == 0 || b == 0) {
			System.out.println("Cannot divide");
			return 0;
		}
		return (a / b);
	}
	
	int multiply(int a, int b) {
		return (a * b);
	}
	
	public static void main(String[] args) {
	OperatorsDemo op = new OperatorsDemo();
	
	System.out.println(op.add(2, 3));

	}

}
