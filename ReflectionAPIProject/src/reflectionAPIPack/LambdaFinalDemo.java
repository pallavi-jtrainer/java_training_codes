package reflectionAPIPack;

interface IFunctional1{
	int operation(int a, int b);
}

interface IFunctional2{
	void printMessage(String msg);
}


public class LambdaFinalDemo {
	int operator(int a, int b, IFunctional1 obj) {
		return obj.operation(a, b);
	}

	public static void main(String[] args) {
		IFunctional1 add = (int a, int b) -> a+b;

		IFunctional1 multiply = (int a, int b) -> a*b;
		
		LambdaFinalDemo lfd = new LambdaFinalDemo();
		
		System.out.println(lfd.operator(3, 4, multiply));
	}

}
