package newPackage;

public class ExceptionDemo {

	/*
	 * throw nullpointerexception
	 */
	
	/*
	 * method() throws Parseexception
	 */
	
	static void divide_method(int a, int b) throws DivideByZeroException{
		if(b == 0) {
			throw new DivideByZeroException("Cannot divide by Zero");
		}else
			System.out.println(a/b);
	}
	
	static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			   throw new InvalidAgeException("Too Young. Not Valid");
			}
			else
				System.out.println("Hello");
	}
	
		
	public static void main(String[] args) {
		try {
			divide_method(12,0);
		}catch(DivideByZeroException a) {
			System.out.println("In Catch: "+a.getMessage());
		}
		
//		int age = 12;
//		try {
//			validateAge(age);
//		}catch(InvalidAgeException o) {
//			System.out.println(o.getMessage());
//		}
	}
}
